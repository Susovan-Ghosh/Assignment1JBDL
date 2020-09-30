package com.JBDL.Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    Environment environment;
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/server_port")
    public String getPortNumber() {
        return environment.getProperty("server.port");
    }

    @GetMapping("/books")
    public List<Book> getAllBooksInDB() {
        return bookRepository.findAll();
    }

    @PostMapping("/book")
    public void insertBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @PutMapping("/books_update")
    public void updateNames(@RequestParam("name") String name) {
        bookRepository.updateNames(name);
    }

    @DeleteMapping("/delete")
    public void deleteEntries(@RequestParam("cost") int cost) {
        bookRepository.deleteEntries(cost);
    }

}
