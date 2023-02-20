package tyler.bookclub.controllers;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    
    @GetMapping("/books")
    public String allBooks(){
        return "books/index.jsp";
    }

}
