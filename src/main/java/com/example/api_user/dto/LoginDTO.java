package com.example.api_user.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data

public class LoginDTO {
    private String username;
    private String password;

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

