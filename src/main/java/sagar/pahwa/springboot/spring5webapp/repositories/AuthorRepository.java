package sagar.pahwa.springboot.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sagar.pahwa.springboot.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{
}
