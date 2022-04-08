package kz.narxoz.narxozapp.repository;

import kz.narxoz.narxozapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
