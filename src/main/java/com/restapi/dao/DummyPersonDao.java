package com.restapi.dao;

import com.restapi.model.Person;
import com.restapi.util.Jobs;

import java.util.*;

public interface DummyPersonDao {
    Jobs[] jobs = new Jobs[]{Jobs.BAKER, Jobs.BUILDER, Jobs.CARPENTER, Jobs.DRIVER, Jobs.BLACKSMITH};

    int savePerson(UUID id, Person person);

    default int savePerson(Person person) {
        UUID id = UUID.randomUUID();
        int randomNum = 1 + (int)(Math.random() * (3 + 1));
        person.setJob(String.valueOf(jobs[randomNum]));
        person.setHasHome(randomNum % 2 == 0);
        person.setAddress("DISTRICT 1");
        System.out.println(person);
        return savePerson(id, person);
    }

}
