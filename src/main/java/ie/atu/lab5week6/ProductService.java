package ie.atu.lab5week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private  List<Product> myList = new ArrayList<>();
    public List<Product> addProduct (Product product){
        //Do business stuff like retrieving details from db, or generating files pdf
        myList.add(product);
        return myList;
    }
}
