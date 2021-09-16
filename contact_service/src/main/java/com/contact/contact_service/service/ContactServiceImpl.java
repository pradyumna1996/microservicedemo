package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import com.contact.contact_service.entity.Contact;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

List<Contact> list= List.of(
     new Contact(121L, "hari@gmail.com","Hari", 130L),
     new Contact(122L, "shyam@gmail.com","Shyam", 130L),
     new Contact(123L, "niru@gmail.com","Niru", 131L),
     new Contact(124L, "somy@gmail.com","Somy", 131L),
     new Contact(125L, "ashirwad@gmail.com","Ashirwad", 132L)

     );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {

        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
