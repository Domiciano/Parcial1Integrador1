package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.CartEntry;
import edu.co.icesi.banner.entity.Product;
import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.repositories.CartEntryRepository;
import edu.co.icesi.banner.repositories.ProductRepository;
import edu.co.icesi.banner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CartRegistryController {

    @Autowired
    private CartEntryRepository cartEntryRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping(value = "cart/add/{userid}/{productid}")
    public ResponseEntity<?> add(@PathVariable String userid, @PathVariable int productid){

        Optional<User> user = userRepository.findById(userid);
        if(user.isPresent()){
            Optional<Product> product = productRepository.findById(productid);
            if(product.isPresent()){
                CartEntry a = new CartEntry();
                a.setUser(user.get());
                a.setProduct(product.get());
                cartEntryRepository.save(a);
                return ResponseEntity.status(200).body("Done");
            }
        }
        return ResponseEntity.status(400).body("Fail");
    }

    @DeleteMapping(value = "cart/add/{userid}/{productid}")
    public ResponseEntity<?> remove(@PathVariable String userid, @PathVariable int productid) {
        List<CartEntry> entryList = cartEntryRepository.getEntries(userid, productid);
        if(entryList.size() > 0) {
            CartEntry entry = entryList.get(0);
            cartEntryRepository.deleteById(entry.getId());
            return ResponseEntity.status(200).body("Done");
        }
        return ResponseEntity.status(400).body("Fail");
    }



}
