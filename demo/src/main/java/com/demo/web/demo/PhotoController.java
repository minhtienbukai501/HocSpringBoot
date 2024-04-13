package com.demo.web.demo;

import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
public class PhotoController {
    private Map<String, Photo> db = new HashMap<>(){{
        put("1", new Photo("1", "file1.png"));
        put("2", new Photo("2", "file2.png"));
        put("3", new Photo("3", "file3.png"));
    }};


    @GetMapping("/")

    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/photo")
    public Collection<Photo> get(){
        return this.db.values();
    }

    @GetMapping("/photo/{id}")
    public Photo getById(@PathVariable String id){
        Photo photo = this.db.get(id);
        if(photo == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return this.db.get(id);
    };

    @DeleteMapping("/photo/{id}")
    public void DeleteById(@PathVariable String id){
        Photo photo = this.db.remove(id);
        if(photo == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }


    }

    @PostMapping("/photo/")
    public Photo create (Photo photo){
        photo.setId(UUID.randomUUID().toString());
        db.put(photo.getId(), photo);
        return photo;
    }
}
