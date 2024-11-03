package com.restapi.service;

import com.restapi.dao.DummyPersonDao;
import com.restapi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    @Autowired
    private DummyPersonDao dummyPersonDao;


    void addPerson(Person person) {
        dummyPersonDao.savePerson(person);
    }


}
