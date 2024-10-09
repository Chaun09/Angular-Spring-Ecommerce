package com.example.webecom.services.auth;

import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;

public interface AuthService  {

    UserDto creataCustomer(SignUpRequest signUpRequest);


}
