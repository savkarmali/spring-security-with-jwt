package com.sau.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private String username;
    private String role;    // e.g., ROLE_USER or ROLE_ADMIN
}
