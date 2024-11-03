package com.restapi.dao;

import com.restapi.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DummyPersonDaoImpl implements DummyPersonDao {

    private static List<Person> personList = new ArrayList<>();

    @Override
    public int savePerson(UUID id, Person person) {
        personList.add(new Person(id, person.getName(), person.getJob(), person.isHasHome(), person.getAddress()));
        return 1;
    }
}
