package com.contact.service;
import com.contact.entity.contact;
import  java.util.List;
public interface ContactService {
    public List<contact>getContactactsOfUser(Long userId);
}
