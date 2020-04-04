package com.jay.controller;

import com.jay.dbEntity.Contacts;
import com.jay.repository.ContactsRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = com.jay.controller.Contacts.class)
class ContactsTest {

    @MockBean
    private ContactsRepo contactsRepo;

    @Test //TO DO .. 
    void addContact() {
        Contacts c = new Contacts("jay","sam","abc@gmail.com");
        List<Contacts> cl = new ArrayList<Contacts>();
        cl.add(c);
        Mockito.when(contactsRepo.findAll()).thenReturn(cl);
        Assert.isTrue(true);
    }
}
