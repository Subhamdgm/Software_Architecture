package com.contact.controller;
import java.util.List;
import com.contact.entity.contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    @RequestMapping("/user/{userId}")
    public List<contact> getContacts(@PathVariable("userId") Long userId)
    {
        return this.contactService.getContactactsOfUser(userId);
    }
}
