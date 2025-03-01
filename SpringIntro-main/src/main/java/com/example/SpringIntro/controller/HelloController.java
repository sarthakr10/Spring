package com.example.SpringIntro.controller;
import com.example.SpringIntro.controller.dtu.User;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
   //used request  mapping to get the query in the form of name and display it
//    http://localhost:8080/query?name=Divya
    @RequestMapping(value="/query")
    public String queryController(@RequestParam(value="name") String name){
        return "Hello "+name+" !";
    }

    //used params to take input and display it
//    http://localhost:8080/param/Divya
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name +"! ";
    }
//    http://localhost:8080/post
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName() +" "+ user.getLastName()+" !";
    }
//    http://localhost:8080/put/Divya?LastName=Singh
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable  String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName+" !";
    }
}
