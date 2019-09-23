package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/person")
public class PerconController {

    @Autowired
    PersonRepository personRepository;
    //新增
    @PostMapping("/")
    public void  addPerson(@RequestBody Person person){
        personRepository.save(person);
    }
    //查询
    @GetMapping("/")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }
    //删除
    @DeleteMapping("/{id}")
    public void deletePerson(@RequestParam Long id) {
        personRepository.deleteById(id);
    }
    //修改
    @PutMapping("/")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }


}
