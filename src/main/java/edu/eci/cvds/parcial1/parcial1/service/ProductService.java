package edu.eci.cvds.parcial1.parcial1.service;


import edu.eci.cvds.parcial1.parcial1.entity.Product;
import edu.eci.cvds.parcial1.parcial1.Agent.LogAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private Map<String, Product> products = new HashMap<String, Product>();
    //@Autowired




    public ProductService() {
    }

    /**
     * esta metodo guarda un producto nuevo
     * @param product
     * @return
     * @throws Exception
     */
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

    /**
     * esta metodo busca un producto segun su nombre
     * @param name
     * @return
     * @throws Exception
     */
    public Product getProductById(String name) throws Exception {
        if(products.get(name)== null){
            throw new Exception("no existe el producto");
        }else {
            return products.get(name);
        }
    }

    /**
     * este metodo actualiza el stock de un producto
     * @param name
     * @param stock
     * @return product
     * @throws Exception
     */
    public Product updateStock(String name, int stock) throws Exception {
        if(products.get(name) == null){
            throw new Exception("dont exist producto");
        }else{
            Product product = products.get(name);
            product.setStock(stock);
            //longAgent.update(product);
            return product;
        }
    }

}
