package com.example.webecom.controller;
import com.example.webecom.dto.ProductDto;
import com.example.webecom.entity.Product;
import com.example.webecom.services.auth.AuthServiceImpl;
import com.example.webecom.services.auth.ProducService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class ProductController {

    private final ProducService producService;

    @GetMapping("/showAllProduct")
    public ResponseEntity<?> showAllProduct(){
        return producService.showAllProduct();
    }
    @GetMapping("/showProductById/{id}")
    public ResponseEntity<?> showProduct(@PathVariable Long id){
        return producService.showProductById(id);

    }
    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto){
        return producService.addProduct(productDto);

    }

}
