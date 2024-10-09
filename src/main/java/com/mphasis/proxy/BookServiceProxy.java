package com.mphasis.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mphasis.domain.Book;

@FeignClient("book-service")
public interface BookServiceProxy {
	
	@GetMapping("/book/{id}")
	public Book getBooktById(@PathVariable Long id);
	
	@GetMapping("/book")
	public List<Book> getAllBooks(); 

}
