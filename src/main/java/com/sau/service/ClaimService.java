package com.sau.service;

import com.sau.dto.ClaimRequestDTO;
import com.sau.entity.Claim;
import com.sau.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {
    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private PolicyClient policyClient;

    public Claim processClaim(ClaimRequestDTO request){
        if (!policyClient.isPolicyValid(request.getPolicyNumber())){
            throw new RuntimeException("Invalid Policy");
        }
        Double coverage = policyClient.getCoverageAmount(request.getPolicyNumber());

        Claim claim = new Claim();
        claim.setPolicyNumber(request.getPolicyNumber());
        claim.setCustomerId(request.getCustomerId());
        claim.setClaimAmount(request.getClaimAmount());

        if(request.getClaimAmount() <= coverage){
            claim.setStatus("APPROVED");
        }else {
            claim.setStatus("UNDER_REVIEW");
        }
        return claimRepository.save(claim);
    }
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

}
