package com.jay.repository;

import com.jay.dbEntity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepo extends JpaRepository<Contacts, Long> {
    List<Contacts> findByLastName(String lastName);

    Contacts findById(long id);
}
