package com.example.webecom.entity;

import com.example.webecom.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    @Column(unique=true)
    private String price;
    private String quantity;
    private String feedback;
    private String file_pic;


}