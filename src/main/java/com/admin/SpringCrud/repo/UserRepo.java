package com.admin.SpringCrud.repo;

import com.admin.SpringCrud.bean.Users;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<Users,String> {
}
