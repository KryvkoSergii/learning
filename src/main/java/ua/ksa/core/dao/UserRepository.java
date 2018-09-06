package ua.ksa.core.dao;

import org.springframework.data.repository.CrudRepository;
import ua.ksa.core.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}

