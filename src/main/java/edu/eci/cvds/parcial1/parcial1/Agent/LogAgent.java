package edu.eci.cvds.parcial1.parcial1.Agent;

import edu.eci.cvds.parcial1.parcial1.entity.Product;
import edu.eci.cvds.parcial1.parcial1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LogAgent{



    public void update(Product product) throws Exception {
        System.out.println(product.getName() + " -> " + product.getStock() + "unidades disponibles");
    }


}
