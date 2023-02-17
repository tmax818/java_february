package tyler.dojoninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tyler.dojoninjas.models.Dojo;
import tyler.dojoninjas.services.DojoService;

@Controller
public class MainController {

    @Autowired DojoService dojoService;
    
    @RequestMapping(value={"/dojos/new", "/"})
    public String newDojo(@ModelAttribute("dojo")Dojo dojo){
        return "dojos/new.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo")Dojo dojo){
        dojoService.createDojo(dojo);
        return "redirect:/";
    }
}
