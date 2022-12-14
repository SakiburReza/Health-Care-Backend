package com.health_care.backend.Person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@CrossOrigin
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/authenticate-user")
    public ObjectNode authenticateUser(@RequestBody Map<String, String> userMap) {
        String email = userMap.get("email");
        String password = userMap.get("password");

        return service.authenticatePerson(email, password);
    }
    @GetMapping("/get-person-by-id/{id}")
    public Person getPersonById(@PathVariable int id){
        return service.findPersonById(id);
    }
    @GetMapping("/get-person-by-mail/{mail}")
    public Person getPersonByEmail(@PathVariable String mail){
        return service.getPersonByEmail(mail);
    }

}
