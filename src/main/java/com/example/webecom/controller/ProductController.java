package com.example.webecom.controller;
import com.example.webecom.services.auth.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class ProductController {
    private final AuthServiceImpl authServe;
    @GetMapping("/showAllProduct")
    public ResponseEntity<?> showAllProduct(){
        return authServe.showAllProduct();
    }

}
