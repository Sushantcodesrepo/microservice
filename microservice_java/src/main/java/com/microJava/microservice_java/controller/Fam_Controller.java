package com.microJava.microservice_java.controller;

import com.microJava.microservice_java.exception.ResourceNotFoundException;
import com.microJava.microservice_java.model.Fam_Data;
import com.microJava.microservice_java.repository.Fam_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/api/v2/famdata")
    public class Fam_Controller {
    @Autowired
    private  Fam_Repo frepo;



    @GetMapping
    public List<Fam_Data> getAllFam(){
        return frepo.findAll();
    }

    @PostMapping
    public Fam_Data famCreate(@RequestBody Fam_Data fam_data){
        return frepo.save(fam_data);

    }
    @GetMapping("{id}")
    public ResponseEntity<Fam_Data> getFam_dataById( @PathVariable long id){
        Fam_Data fam_data=frepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Famliy data does not exist" + id));
        return ResponseEntity.ok(fam_data);

    }


    @PutMapping("{id}")
    public ResponseEntity<Fam_Data> updateFam_data(@PathVariable long id, @RequestBody Fam_Data updatefamdetails){
        Fam_Data updatefam_data=frepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Familiy data not found" +  id));
        updatefam_data.setFirst_Name(updatefamdetails.getFirst_Name());
        updatefam_data.setLast_Name(updatefamdetails.getLast_Name());
        updatefam_data.setSon_Of(updatefamdetails.getSon_Of());
        updatefam_data.setAge(updatefamdetails.getAge());
        updatefam_data.setPhone_No(updatefamdetails.getPhone_No());
        return ResponseEntity.ok(updatefamdetails);

    }







}
