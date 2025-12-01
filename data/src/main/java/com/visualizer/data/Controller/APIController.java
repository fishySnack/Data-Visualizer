package com.visualizer.data.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visualizer.data.Entity.AccountEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/DataT")
public class APIController {
    
    @GetMapping("/login")
    public ResponseEntity<AccountEntity> login() {
        return ResponseEntity.ok().body(new AccountEntity()); //temp
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody String entity) {
        return ResponseEntity.ok().body("Logged out"); //temp
    }

    @PostMapping("/create/account")
    public ResponseEntity<String> createAccount(@RequestBody String entity) {
        //TODO: process POST request

        return ResponseEntity.ok().body(entity);
    }

    @PostMapping("/create/visual")
    public ResponseEntity<String> createVisualization(@RequestBody String entity) {
        //TODO: process POST request

        return ResponseEntity.ok().body(entity);
    }

    @PutMapping("/edit/account/{id}")
    public ResponseEntity<String> updateAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request

        return ResponseEntity.ok().body(entity);
    }

    @DeleteMapping("/delete/account/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable String id) {
        //TODO: process DELETE request

        return ResponseEntity.ok().body("Account deleted");
    }

}
