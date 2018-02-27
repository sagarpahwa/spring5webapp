package sagar.pahwa.springboot.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sagar.pahwa.springboot.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
