package kz.narxoz.narxozapp.repository;

import kz.narxoz.narxozapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
