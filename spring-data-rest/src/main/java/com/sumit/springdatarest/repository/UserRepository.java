package com.sumit.springdatarest.repository;

import com.sumit.springdatarest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User,Long> {


    //use by:- Search/findByFirstName?firstName=given name  by you
    List<User> findByFirstName(@Param("firstName") String FirstName);
}
