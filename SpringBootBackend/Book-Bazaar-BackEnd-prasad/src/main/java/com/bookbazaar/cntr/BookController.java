package com.bookbazaar.cntr;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bookbazaar.model.Book;
import com.bookbazaar.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
	
	private ObjectMapper mapper = new ObjectMapper();
	@Autowired
	private BookService bookService;
	@PostMapping(value = {"/books"}) 
	public ResponseEntity<String> userAdd(@RequestBody Book book) {
		String base64Image = book.getBook_img();
		  String[] parts = base64Image.split(",");
		  String imageType = parts[0].split("/")[1];
		  String imageData = parts[1];
		  String path1="C:/Users/ashis/Desktop/Bookbaz/public/images/"+book.getBooktitle()+"." + imageType;
		  //C:\Users\ashis\Desktop\Bookbaz\public\images
		  String[] path2=path1.split(";");
		  System.out.println(path2[1]);
		  System.out.println(path2[0]);
		  String type=imageType;
		  String[] type1=type.split(";");
		  System.out.println(type1[1]);
		  System.out.println(type1[0]);
		  Date date = new Date();
		  book.setDATETIME(date.toString());
		  System.out.println(book.getAuther().getId());

		  byte[] bytes = Base64.getDecoder().decode(imageData);
		  Path path = Paths.get(path2[0]);
		  try {
		    Files.write(path, bytes);
		    book.setBook_img("/images/"+book.getBooktitle()+"."+type1[0]);
			bookService.addBook(book);
			return  new ResponseEntity<String>("Hello World", new HttpHeaders(), 200);
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
		
		  return  new ResponseEntity<String>("Hello World", new HttpHeaders(), 200);
	}
	@PostMapping(value = {"/bookUser"}) 
	public String bookModify(@RequestBody Book book) {
		bookService.modify(book);
		return "success";
	}
	
	@GetMapping(value = {"/Books/{bookId}"})
	public Book userGet(@PathVariable int bookId) {
		return bookService.getByBook_Id(bookId);
	}
	@GetMapping(value = {"/Booksuu/{booklike}"})
	public List<Book> bookList(@PathVariable String booklike) {
		return bookService.getBylike(booklike);
	}
	@GetMapping(value = {"/Booksgenre/{book}"})
	public List<Book> bookListgenre(@PathVariable String book) {
		return bookService.getByGenre(book);
	}
	@GetMapping(value = {"/getallbook"})
	public List<Book> productList(){
		return bookService.getAll();
	}
	@GetMapping(value = {"/getallbookgenre"})
	public List<String> genreList(){
		return bookService.selectDistinctGenre();
	}

}
