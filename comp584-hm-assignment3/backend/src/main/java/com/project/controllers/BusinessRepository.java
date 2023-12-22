package com.project.controllers;

import org.springframework.data.repository.CrudRepository;
import com.example.accessingdatamysql.User;

public interface BusinessRepository extends CrudRepository<Business, Long>  {
    
}

public interface BusinessRepository extends CrudRepository<Business, String>  {
    
}

public interface BusinessRepository extends CrudRepository<Business, double>  {
    
}

public interface BusinessRepository extends CrudRepository<Business, int>  {
    
}