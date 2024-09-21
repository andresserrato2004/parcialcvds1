package edu.eci.cvds.parcial1.parcial1.service;


import edu.eci.cvds.parcial1.parcial1.entity.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private Map<String, Product> products = new HashMap<String, Product>();


    public ProductService() throws Exception {
        Product prod1 = new Product("xbox",1500,5,"videogames");
        Product prod2 = new Product("vaca",1000, 7,"ganado");
        SaveProduct(prod2);
        SaveProduct(prod1);

    }

    public Product SaveProduct (Product product) throws Exception {

        if (product == null) {
            throw new Exception("the product dont have null");
        }
        if (products.get(product.getName()) != null) {
            throw new Exception("the product already exist in database");
        }
        return products.put(product.getName(), product);
    }

    public Map<String, Product> getAllProducts(){
        return products;
    }

    public Product getProductById(String name) throws Exception {
        if(products.get(name)== null){
            throw new Exception("no existe el producto");
        }else {
            return products.get(name);
        }
    }

    public Product updateStock(String name, int stock) throws Exception {
        if(products.get(name) == null){
            throw new Exception("dont exist producto");
        }else{
            Product product = products.get(name);
            product.setStock(stock);
            return product;
        }
    }

}
