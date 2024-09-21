package edu.eci.cvds.parcial1.parcial1.observer;

import edu.eci.cvds.parcial1.parcial1.entity.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductObserver {
    public void update(Product product);
}
