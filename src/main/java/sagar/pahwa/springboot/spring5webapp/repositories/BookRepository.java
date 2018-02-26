package sagar.pahwa.springboot.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sagar.pahwa.springboot.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
