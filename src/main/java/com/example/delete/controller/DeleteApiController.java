package com.example.delete.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {
    @DeleteMapping("/delete/{userID}")
    public void delete(@PathVariable String userID, @RequestParam String account){

        System.out.println(userID);
        System.out.println(account);
    }
}
