package com.restapi.api;

import com.restapi.model.Person;
import com.restapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/api/")
public class PersonController {


    @Autowired
    private PersonService personService;

    @PostMapping
    public String addPerson(Person person) {
        personService.addPerson(person);
        return "added";
    }

    @GetMapping
    public List<Person> getPerson() {

        return new ArrayList<>();
    }

}
