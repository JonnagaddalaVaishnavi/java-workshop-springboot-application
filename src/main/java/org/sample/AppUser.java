package org.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "AppUser")
public class AppUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    // Constructors
    public AppUser() {}
    public AppUser(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}