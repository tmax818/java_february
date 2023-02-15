package tyler.bookcrud.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tyler.bookcrud.models.Book;
import tyler.bookcrud.services.BookService;

@Controller
public class MainController {

    // ArrayList<Book> books = new ArrayList<>();
    @Autowired BookService bookService;
    

    //! CREATE

    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book")Book book){
        return "new.jsp";
    }

    // @RequestMapping(value="/books", method=RequestMethod.POST)
    // public String createBook(){
    //     return "redirect:/";
    // }

    @PostMapping("/books")
    public String createBook(
        // @RequestParam("title")String title,
        // @RequestParam("author")String author,
        // @RequestParam("pages")Integer pages, HttpSession session
        @ModelAttribute("book")Book book
    ){
        bookService.createBook(book);
        return "redirect:/";
    }


    //! READ ALL
    
    @RequestMapping("/")
    public String index(Model model){
        List<Book> books = bookService.allBooks();
        System.out.println(books);
        model.addAttribute("books", books);
        return "index.jsp";
    }


    
    //! READ ONE

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Book book = bookService.getOneBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
    

    //! UPDATE


    //! DELETE

}
