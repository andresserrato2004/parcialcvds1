package edu.eci.cvds.parcial1.parcial1.service;

import edu.eci.cvds.parcial1.parcial1.entity.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class ProductServicetest {

/**
    @Autowired
    private ProductService productService;

    @Test
    public void saveProductSuccessfully() throws Exception {
        Product product = new Product("playstation", 2000, 3, "videogames");
        Product savedProduct = productService.SaveProduct(product);
        assertEquals(product, savedProduct);
    }

    @Test
    public void saveProductThrowsExceptionWhenProductIsNull() {
        Exception exception = assertThrows(Exception.class, () -> {
            productService.SaveProduct(null);
        });
        assertEquals("the product dont have null", exception.getMessage());
    }

    @Test
    public void saveProductThrowsExceptionWhenProductAlreadyExists() throws Exception {
        Product product = new Product("nintendo", 1800, 4, "videogames");
        productService.SaveProduct(product);
        Exception exception = assertThrows(Exception.class, () -> {
            productService.SaveProduct(product);
        });
        assertEquals("the product already exist in database", exception.getMessage());
    }

    @Test
    public void getProductByIdSuccessfully() throws Exception {
        Product product = new Product("sega", 1200, 2, "videogames");
        productService.SaveProduct(product);
        Product retrievedProduct = productService.getProductById("sega");
        assertEquals(product, retrievedProduct);
    }

    @Test
    public void getProductByIdThrowsExceptionWhenProductDoesNotExist() {
        Exception exception = assertThrows(Exception.class, () -> {
            productService.getProductById("nonexistent");
        });
        assertEquals("no existe el producto", exception.getMessage());
    }

    @Test
    public void updateStockSuccessfully() throws Exception {
        Product product = new Product("atari", 1000, 1, "videogames");
        productService.SaveProduct(product);
        Product updatedProduct = productService.updateStock("atari", 5);
        assertEquals(5, updatedProduct.getStock());
    }

    @Test
    public void updateStockThrowsExceptionWhenProductDoesNotExist() {
        Exception exception = assertThrows(Exception.class, () -> {
            productService.updateStock("nonexistent", 5);
        });
        assertEquals("dont exist producto", exception.getMessage());
    }
    **/
}
