package edu.eci.cvds.parcial1.parcial1.observer;

import edu.eci.cvds.parcial1.parcial1.entity.Product;
import edu.eci.cvds.parcial1.parcial1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogAgent {
    @Autowired
    private ProductService productService;

    public void update(String name) throws Exception {
        System.out.println(productService.getProductById(name) + " -> " + productService.getProductById(name).getStock() + "unidades disponibles");
    }

}
