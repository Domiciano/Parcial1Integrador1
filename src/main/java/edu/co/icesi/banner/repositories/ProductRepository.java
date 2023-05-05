package edu.co.icesi.banner.repositories;

import edu.co.icesi.banner.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
