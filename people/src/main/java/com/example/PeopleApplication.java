package com.example;

import com.example.model.Person;
import com.example.services.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@SpringBootApplication
@RestController
@EnableResourceServer
@RequestMapping("/people")
public class PeopleApplication {

    @Autowired
    PeopleRepository peopleRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> index() {
        return peopleRepository.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@Valid @RequestBody Person p) {
        peopleRepository.add(p);
        return "ok";
    }

    @RequestMapping(path = "{userIdx}/activate",method = RequestMethod.POST)
    public String activate(@PathVariable int userIdx) {
        peopleRepository.activate(userIdx);
        return "ok";
    }

	public static void main(String[] args) {
		SpringApplication.run(PeopleApplication.class, args);
	}
}
