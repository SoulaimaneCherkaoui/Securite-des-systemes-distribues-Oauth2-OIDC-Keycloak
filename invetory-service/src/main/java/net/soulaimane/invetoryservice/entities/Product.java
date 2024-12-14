package net.soulaimane.invetoryservice.entities;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Builder
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}