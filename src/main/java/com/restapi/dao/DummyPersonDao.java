package com.restapi.dao;

import com.restapi.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface DummyPersonDao {

    int savePerson(UUID id, Person person);

    default int savePerson(Person person) {
        UUID id = UUID.randomUUID();
        return savePerson(id, person);
    }

}
