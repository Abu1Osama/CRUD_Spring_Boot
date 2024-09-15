package com.abuosama.learningspringboot.repository;

import com.abuosama.learningspringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
