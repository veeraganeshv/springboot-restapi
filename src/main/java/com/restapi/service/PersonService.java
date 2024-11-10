package com.restapi.service;

import com.restapi.dao.DummyPersonDao;
import com.restapi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    @Qualifier("dummyPersonDao")
    private DummyPersonDao dummyPersonDao;


    public int addPerson(Person person) {
        return dummyPersonDao.savePerson(person);
    }


    public List<Person> getAllPeople() {
        return dummyPersonDao.getAllPeople();
    }
}
