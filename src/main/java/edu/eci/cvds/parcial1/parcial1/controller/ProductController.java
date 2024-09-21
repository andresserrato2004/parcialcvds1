package edu.eci.cvds.parcial1.parcial1.controller;


import edu.eci.cvds.parcial1.parcial1.entity.Product;
import edu.eci.cvds.parcial1.parcial1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping({"/api/products"})

/**
 *
 */
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public Map<String, Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/{name}")
    public ResponseEntity<?> getProductById(@PathVariable String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found product " + e);
        }
    }

    /**
     *
     * @param product
     * @return
     */
    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.SaveProduct(product));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no se puede guardar el producto");
        }
    }

    /**
     *
     * @param name
     * @param stock
     * @return
     */


    @PutMapping("/update/{name}/stock")
    public ResponseEntity <?> updateProduct(@PathVariable String name, @RequestParam int stock){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(productService.updateStock(name, stock));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("stock could not be updated");
        }
    }
}
