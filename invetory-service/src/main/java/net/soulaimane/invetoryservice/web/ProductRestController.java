package net.soulaimane.invetoryservice.web;

import net.soulaimane.invetoryservice.entities.Product;
import net.soulaimane.invetoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product> productsList(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product productsById(@PathVariable String id){
        return productRepository.findById(id).get();
    }

}
