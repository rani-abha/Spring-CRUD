package com.admin.SpringCrud.controller;

import com.admin.SpringCrud.bean.Users;
import com.admin.SpringCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public List<Users> getAllUser()
    {
        return userService.getAllUsers();
    }
    @RequestMapping(method = RequestMethod.POST, value="/user")
    public void addUser(@RequestBody Users user)
    {
        userService.addUser(user);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/user/{id}")
    public void upadteUser(@PathVariable String id, @RequestBody Users user)
    {
        userService.updateUser(id,user);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/user/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
//    @RequestMapping(method = RequestMethod.GET, value="/user/{id}")
//    public void getUser(@PathVariable String id, @RequestBody Users user)
//    {
//        return this.userService.getUser(id);
//    }
}
