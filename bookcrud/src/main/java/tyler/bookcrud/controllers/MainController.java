package tyler.bookcrud.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        @Valid @ModelAttribute("book")Book book, BindingResult result
        ){
            if(result.hasErrors()){
                return "new.jsp";
            } else {
                bookService.createBook(book);
                return "redirect:/";
            }
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
    
    @GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Book book = bookService.getOneBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @PutMapping("/books/{id}")
    public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("book")Book book, BindingResult result, Model model){
        if(result.hasErrors()){
            return "edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/";
        }
    }
    
    //! DELETE
    @DeleteMapping("/books/{id}")
    public String destroy(@PathVariable("id")Long id){
        Book book = bookService.getOneBook(id);
        bookService.deleteBook(book);
        return "redirect:/";


    }

}
