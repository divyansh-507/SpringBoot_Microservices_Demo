package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceimpl implements ContactService {

    List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Amit Mishra", 1311L),
            new Contact(2L, "anil@gmail.com", "Anil Kumble", 1311L),
            new Contact(3L, "rohan@gmail.com", "Rohan Cariappa", 1312L));

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
