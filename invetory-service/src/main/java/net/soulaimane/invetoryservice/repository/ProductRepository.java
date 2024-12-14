package net.soulaimane.invetoryservice.repository;

import net.soulaimane.invetoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}