package com.example.webecom.services.auth;

import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.User;
import com.example.webecom.enums.UserRole;
import com.example.webecom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public UserDto creataCustomer(SignUpRequest signUpRequest) {
        User user = new User();
        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setAgain_password(signUpRequest.getAgain_password());
        user.setUserRole(UserRole.CUSTOMERS);
        UserDto userDto = new UserDto();
        User create = userRepository.save(user);
        userDto.setId(create.getId());
        return userDto;
    }


    public ResponseEntity<?> showAllCustomer(){
        List<User> users = userRepository.findAll();
        if(users.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(users);
    }

    public ResponseEntity<?> showCustomerById(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(user);
    }

    public void deleteCustomerById(Long id){
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(userRepository::delete);

    }

    public ResponseEntity<?> updateCustomer(Long id, UserDto userDto) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        user.get().setEmail(userDto.getEmail());
        user.get().setUserRole(userDto.getUserRole());
        user.get().setName(userDto.getUsername());
        userRepository.save(user.get());
        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }



}
