package com.minha_primeira_api.Mtech.resources;

import com.minha_primeira_api.Mtech.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L,"Matheus", "mm@gmail.com", "11944553322","132456");
        return ResponseEntity.ok().body(u);

    }


}
