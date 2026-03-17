package com.sau.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "claims")
@Setter
@Getter
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String policyNumber;
    private String customerId;
    private Double claimAmount;
    private String status;
}
