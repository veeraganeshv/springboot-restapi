package com.restapi.api;

import com.restapi.model.Person;
import com.restapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/person")
public class PersonController {


    @Autowired
    private PersonService personService;

    @PostMapping
    public String addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return "added";
    }

    @GetMapping
    public List<Person> getPerson() {
        return personService.getAllPeople();
    }

    @DeleteMapping
    public String deletePerson(@RequestParam String id) {
        return "deleted successfully";
    }

}
