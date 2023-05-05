package edu.co.icesi.banner.repositories;

import edu.co.icesi.banner.entity.CartEntry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartEntryRepository extends CrudRepository<CartEntry, Integer> {
    //CRUD

    @Query(value = "SELECT c FROM CartEntry c WHERE c.user.id = :userid AND c.product.id = :productid")
    List<CartEntry> getEntries(String userid, int productid);

}
