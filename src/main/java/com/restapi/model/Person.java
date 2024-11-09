package com.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    @JsonProperty("id")
    UUID id;

    @JsonProperty("name")
    String name;

    @JsonProperty("job")
    String job;

    @JsonProperty("hasHome")
    boolean hasHome;

    @JsonProperty("address")
    String address;

    public Person(UUID id, String name, String job, boolean hasHome, String address) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.hasHome = hasHome;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isHasHome() {
        return hasHome;
    }

    public void setHasHome(boolean hasHome) {
        this.hasHome = hasHome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", hasHome=" + hasHome +
                ", address='" + address + '\'' +
                '}';
    }
}
