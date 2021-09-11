package com.sofkau.SpringBootCrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String age;


    public Persona() {
    }

    public Persona(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Persona(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}



