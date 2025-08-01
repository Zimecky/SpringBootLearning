package guru.spingframework.spring_6_webapp.repositories;

import guru.spingframework.spring_6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
