package com.sau.controller;

import com.sau.dto.ClaimRequestDTO;
import com.sau.entity.Claim;
import com.sau.service.ClaimService;
import com.sau.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username) {
        // Implement authentication logic here
        return jwtUtil.generateToken(username);
    }

    @PostMapping("/claims")
    public Claim raiseClaim(@RequestBody ClaimRequestDTO request){

        return claimService.processClaim(request);
    }
    @GetMapping("/claims")
    public List<Claim> getAllClaims() {
        return claimService.getAllClaims();
    }


}
