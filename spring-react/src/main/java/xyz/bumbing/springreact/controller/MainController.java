package main.java.xyz.bumbing.springreact.controller;

@Controller
public class MainController {
 
    @GetMapping("/{name}.html")
    public String page(@PathVariable String name, Model model) {
        model.addAttribute("pageName", name);
        return "index";
    }
 
}
