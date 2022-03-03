package kz.narxoz.narxozapp.repository;

import kz.narxoz.narxozapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Jpa Metods
    List<User> findByNameStartsWith(String name);

    List<User> findByEmailContainingOrderByNameDesc(String email);

    // Native Query
    @Query(value = "select * from users order by surname", nativeQuery = true)
    List<User> findAllSorted();

    @Query(value = "select * from users where id > :qid", nativeQuery = true)
    List<User> findByGreaterId(Long qid);

}
