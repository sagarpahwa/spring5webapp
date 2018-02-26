package sagar.pahwa.springboot.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sagar.pahwa.springboot.spring5webapp.model.Author;
import sagar.pahwa.springboot.spring5webapp.model.Book;
import sagar.pahwa.springboot.spring5webapp.repositories.AuthorRepository;
import sagar.pahwa.springboot.spring5webapp.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData(){

        //Dan Brown
        Author dan = new Author("Dan","Brown");
        Book inferno = new Book("Inferno","1122","ABC");
        inferno.getAuthors().add(dan);
        dan.getBooks().add(inferno);
        bookRepository.save(inferno);
        authorRepository.save(dan);

        //Stephen King
        Book shining = new Book("The Shining","1123","cde");
        Author stephen = new Author("Stephen","King");
        //shining.getAuthors().add(dan);
        shining.getAuthors().add(stephen);
        stephen.getBooks().add(shining);
        bookRepository.save(shining);
        authorRepository.save(stephen);

    }

}
