package ie.atu.lab5week6;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private  ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list =new ArrayList<>();
    //creating a class which is interested in requests and responses. Separation of Concern
    @PostMapping
    public List<Product> newProduct(@Valid @RequestBody Product product){
        //send it to do business logic
       // ProductService myService = new ProductService();
        list = myService.addProduct(product);
        return  list;
    }
   /*@PutMapping
    public List<Product> updateProduct(@PathVariable("id")String id, @RequestBody Product product){
        for(Product p: myService){

        }
    } */

}
