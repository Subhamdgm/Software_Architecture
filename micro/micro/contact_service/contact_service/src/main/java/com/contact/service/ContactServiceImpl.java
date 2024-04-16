package com.contact.service;
import com.contact.entity.contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImpl implements ContactService{
    List<contact> list=List.of(
            new contact(1L,"priyansh@gmail.com","priyansh",1311L),
            new contact(2L,"nishant@gmail.com","nishant",1311L),
            new contact(3L,"Aniket@gmail.com","Aniket",1313L)
    );
    @Override
    public List<contact> getContactactsOfUser(Long userId)
    {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
