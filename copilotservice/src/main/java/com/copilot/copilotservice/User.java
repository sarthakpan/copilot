package com.copilot.copilotservice;

// import lambok getters and setters
import lombok.Getter;
import lombok.Setter;

// annotation for getters and setters
@Getter
@Setter
public class User {
    // user class
    private String username;
    private String password;
    private String confirmPassword;
    private String address;
    private String city;
    private String country;
    private String zip;

}
