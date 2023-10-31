package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	  
	//SQL : select * from bootab where author like ?
	@Query("SELECT b FROM Book b WHERE b.author=?1 ")
	//@Query("SELECT b FROM Book b WHERE b.author = :SBMS")
	 List<Book> getBooksByAuthor(@Param("abc") String author); 
	
	
	//SQL: select * from booktab where author like ? or bcost > ?
	@Query("SELECT b FROM Book b WHERE b.author like ?1 OR b.bookCost > ?2 OR b.bookType=?3")
	//@Query("SELECT b FROM Book b WHERE b.bookCost > :bookCost OR b.author like :author")
	  List<Book> getBooksAuthorCost(String author,Double bookCost,String bookType);
	
	//SQL: select * from booktab where bid in (?,?,?)
	@Query("SELECT b FROM Book b WHERE b.bookId in(?1)")
	//@Query("SELECT b FROM Book b WHERE b.bookId in (:inputs)")
	List<Book> getBooksIds(List<Integer> inputs);

}
