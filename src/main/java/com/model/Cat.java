package com.model;

import javax.persistence.*;

/**
 * Created by USER on 01.11.2017.
 */
public class Cat {
    private int id;
    private String name;
    private String poroda;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Basic
    @Column(name = "poroda")
    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (id != cat.id) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return poroda != null ? poroda.equals(cat.poroda) : cat.poroda == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (poroda != null ? poroda.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                '}';
    }
}
