/*package org.sample.Controller;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private final List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/users")
    public List<User> addUser(@RequestBody User user) {
        users.add(user);
        return users;
    }

    // ✅ Make User a static class so Spring can deserialize it


    public static class User {


        Integer id;

        String name;

        int age;

        // ✅ Required: Getters and setters for JSON binding
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Optional: toString for better output formatting
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}

 */



package org.sample.Controller;

import org.sample.AppUser;
import org.sample.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class HelloController {

    private final UserRepository userRepository;

    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return userRepository.save(user);
    }
}