package com.example.webecom.controller;

import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.ResponseMessage;
import com.example.webecom.entity.User;
import com.example.webecom.services.auth.AuthService;
import com.example.webecom.services.auth.AuthServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final AuthServiceImpl authServe;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@Valid @RequestBody SignUpRequest signUpRequest){
        UserDto createdCustomerDto = authService.creataCustomer(signUpRequest);
        if(createdCustomerDto == null){
            return new ResponseEntity<>("Customer not create", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(new ResponseMessage("Created Success"));
    }

    @GetMapping("/showAllCustomer")
    public ResponseEntity<?> showAllCustomer(){
        return authServe.showAllCustomer();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> showCustomer(@PathVariable Long id){
        return authServe.showCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Long id){
       authServe.deleteCustomerById(id);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable Long id, @RequestBody @Valid UserDto userDto){
        return authServe.updateCustomer(id,userDto);
    }











}
