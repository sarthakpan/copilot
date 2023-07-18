package com.copilot.copilotservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
