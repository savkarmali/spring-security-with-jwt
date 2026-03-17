package com.sau.dto;

import lombok.*;

@Setter
@Getter
public class ClaimRequestDTO {

    private String policyNumber;
    private String customerId;
    private Double claimAmount;
}
