package com.jay.controller;

import com.jay.repository.ContactsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

@RestController
public class Contacts {

    @Autowired
    private ContactsRepo contactsRepo;

    @GetMapping("/contacts")
    public List<com.jay.dbEntity.Contacts> getAllEmployees() {
        return contactsRepo.findAll();
    }

    @PostMapping("/addContact")
    public ResponseEntity<com.jay.dbEntity.Contacts> addContact(@Valid @RequestBody com.jay.dbEntity.Contacts contactDetail){
       com.jay.dbEntity.Contacts c = contactsRepo.save(contactDetail);
       return ResponseEntity.ok(c);
    }

    @GetMapping("/contacts/{id}")
    public com.jay.dbEntity.Contacts getAllEmployees(@PathVariable(value = "id") Integer contactId) {
        return contactsRepo.findById(contactId);
    }

}
