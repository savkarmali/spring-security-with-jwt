package com.sau.service;

import org.springframework.stereotype.Component;

@Component
public class PolicyClient {

    public boolean isPolicyValid(String policyNumber){
        // Mock logic
        return policyNumber.startsWith("POL");
    }

    public double getCoverageAmount(String policyNumber){

        return 50000.0;
    }

}
