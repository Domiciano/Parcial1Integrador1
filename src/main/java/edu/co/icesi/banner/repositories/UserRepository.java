package edu.co.icesi.banner.repositories;

import edu.co.icesi.banner.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
