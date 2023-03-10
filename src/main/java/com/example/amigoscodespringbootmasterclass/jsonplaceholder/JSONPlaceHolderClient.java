package com.example.amigoscodespringbootmasterclass.jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {

    @GetMapping("posts")
    List<Post> getPosts();

    @GetMapping("posts/{id}")
    Post getPost(@PathVariable("id") Long id);
}
