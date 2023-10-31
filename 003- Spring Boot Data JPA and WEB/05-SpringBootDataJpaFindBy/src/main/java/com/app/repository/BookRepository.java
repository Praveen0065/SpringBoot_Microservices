package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	//SQL: SELECT * FROM BOOK WHERE AUTHOR=?
	 List<Book> findByAuthor(String author);

	//SQL: SELECT * FROM BOOK WHERE BOOKTYPE=?
	 List<Book> findByBookType(String bookType);
	 
	 //------------------------------------------------//
	 

	    //findBy -->SELECT + where = !=, > < null, not null, and or...
	    //SQL : select * from book where bookCost =?
	    List<Book> findByBookCostLessThanEqual(Double bookCost);
	 
	 
	    //SQL: select * from book where cost>=?
	    List<Book> findByBookCostGreaterThan(Double bookCost);
	 
		//SQL: select * from book where author is null 
		List<Book> findByAuthorIsNull();
		
		//SQL: select * from book where author is not null 
		//List<Book> findByAuthorIsNotNull();
		//List<Book> findByAuthorNotNull();
		
		//------------Like Operator---------//
		List<Book> findByAuthorLike(String author);
		

		//SQL: Select * from book where author like 'input%'
		List<Book> findByAuthorStartingWith(String input);
		
		//SQL: Select * from book where author like '%input'
		List<Book> findByAuthorEndingWith(String input);
		
		//SQL: Select * from book where author like '%input%'
		List<Book> findByAuthorContaining(String input);
		
		//SQL : select * from book where between x and y
		List<Book> findByBookIdBetween(Integer id1,Integer id2);
		
		//--------------AND / OR --------------------------
		//SQL: select * from book where bookId <= ? or bookType like ?
		List<Book> findByBookIdLessThanEqualOrBookTypeLike(Integer bookId, String input);
		
		//-------Single row-------------
		Optional<Book> findByBookId(Integer id);
	 
}
