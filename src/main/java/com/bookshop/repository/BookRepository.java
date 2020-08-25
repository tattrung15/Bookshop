package com.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshop.bookDAO.BookDAO;

@Repository
public interface BookRepository extends JpaRepository<BookDAO, Long>{

}
