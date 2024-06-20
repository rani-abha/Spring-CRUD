package com.admin.SpringCrud.service;

import com.admin.SpringCrud.bean.Users;
import com.admin.SpringCrud.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepo subRepo;

    public List<Users> getAllUsers()
    {
        List<Users> users = new ArrayList<>();
        subRepo.findAll().forEach(users::add);
        return users;
//        return users.stream().filter((user)->user.getId().equals(id)).findAny().orElse(null);
    }

//    public Users getUser(String id){
//        System.out.println("getUsers Executed");
//        List<Users> users = new ArrayList<>();
//        return users.stream().filter((user)->user.getId().equals(id)).findAny().orElse(null);
//
//    }
    public void addUser(Users user){
        subRepo.save(user);
    }
    public void updateUser(String id,Users user){
        subRepo.save(user);
    }

    public void deleteUser(String id){
        subRepo.deleteById(id);
    }
}
