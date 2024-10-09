package com.example.webecom.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class LoginRequest {

    private String password;
    //    @NotBlank(message = "Email is required")
    private String email;
}
