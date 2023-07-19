package com.copilot.copilotservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// generate a rest controller at path of /
@RestController("/")
public class RESTController {
    //generate a post method to login with username and password as body return http status ok
    @PostMapping("/login")
    public String login(String username, String password) {
        //return a string of the username and password
        return "Username: " + username + " Password: " + password;
    }


    //generate a post method to register with username,password, confirmPassword, address, city, country, zip as body
    @PostMapping("/register")
    public String register(String username, String password, String confirmPassword, String address, String city, String country, String zip) {
        //return a string of the username and password
        return "Username: " + username + " Password: " + password + " Confirm Password: " + confirmPassword + " Address: " + address + " City: " + city + " Country: " + country + " Zip: " + zip;
    }

    //generate a post method to register with username,password, confirmPassword, address, city, country, zip as Request body
    @PostMapping("/register2")
    public String register2(@RequestBody User user) {
        //return a string of the username and password
        return "Username: " + user.getUsername() + " Password: " + user.getPassword() + " Confirm Password: " + user.getConfirmPassword() + " Address: " + user.getAddress() + " City: " + user.getCity() + " Country: " + user.getCountry() + " Zip: " + user.getZip();
    }

    //generate a post method to register with username,password, confirmPassword, address, city, country, zip as Request body
    @PostMapping("/register3")
    public String register3(@RequestBody User user) {
        //return a string of the username and password
        return "Username: " + user.getUsername() + " Password: " + user.getPassword() + " Confirm Password: " + user.getConfirmPassword() + " Address: " + user.getAddress() + " City: " + user.getCity() + " Country: " + user.getCountry() + " Zip: " + user.getZip();
    }

    //generate a get method with path varaible of id
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id) {
        //return a string of the id
        return "ID: " + id;
    }
    @PostMapping("/login")
    public ResponseEntity<String> login2(String username, String password) {
        //return a string of the username and password
        return new ResponseEntity<>("result successful result",
                HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<String> register2(String username, String password, String confirmPassword, String address, String city, String country, String zip) {
        //return a string of the username and password
        return new ResponseEntity<>("result successful result",
                HttpStatus.OK);
    }

}
