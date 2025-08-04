package guru.spingframework.spring_6_webapp.services;

import guru.spingframework.spring_6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
