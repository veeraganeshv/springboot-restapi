package com.restapi.dao;

import com.restapi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("dummyPersonDao")
public class DummyPersonDaoImpl implements DummyPersonDao {

    private static List<Person> personList = new ArrayList<>();

    @Override
    public int savePerson(UUID id, Person person) {
        personList.add(new Person(id, person.getName(), person.getJob(), person.isHasHome(), person.getAddress()));
//        log.info("Person list : " + personList);
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return personList;
    }
}
