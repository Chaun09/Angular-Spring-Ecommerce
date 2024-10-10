package com.example.webecom.services.auth;

import com.example.webecom.entity.Product;
import com.example.webecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProducService {
    private final ProductRepository productRepository;

    public ResponseEntity<?> showAllProduct(){
        List<Product> products = productRepository.findAll();
        if(products.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(products);
    }

}
