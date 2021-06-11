package com.appsdeveloperblog.app.ws.ui.controller;

import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "50") int limit,
                          @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort){
        return "Get User method was called with page = "+ page + " with limit = " +limit +" and sort = "+sort;
    }

    @GetMapping(path="/{userId}")
    public UserRest getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setEmail("ramesh@gmail.com");
        returnValue.setFirstName("ramesh");
        returnValue.setLastName("jayaraj");
        returnValue.setUserId("rameshjayaraj");
        return returnValue;
    }

    @PostMapping
    public String createUser(){

        return "Create user method was called...";
    }

    @PutMapping
    public String updateUser(){
        return "Update user method was called...";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete user method was called...";
    }
}
