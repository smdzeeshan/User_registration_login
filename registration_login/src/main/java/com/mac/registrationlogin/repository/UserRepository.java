package com.mac.registrationlogin.repository;

import com.mac.registrationlogin.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

}
