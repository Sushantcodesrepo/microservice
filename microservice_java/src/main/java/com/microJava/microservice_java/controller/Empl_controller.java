package com.microJava.microservice_java.controller;


import com.microJava.microservice_java.exception.ResourceNotFoundException;
import com.microJava.microservice_java.model.Empl_Data;
import com.microJava.microservice_java.model.Fam_Data;
import com.microJava.microservice_java.repository.Empl_Repo;
import com.microJava.microservice_java.repository.Fam_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empldata")
public class Empl_controller {

  @Autowired
  private Empl_Repo erepo;


  @GetMapping
  public List<Empl_Data> getAllEmpl()
  {
      return erepo.findAll();
  }

  //build create employee REST API

  @PostMapping
  public Empl_Data emplcreate(@RequestBody Empl_Data empl_data){
    return erepo.save(empl_data);

  }


  //build get employee by ID REST API
  @GetMapping("{id}")
  public ResponseEntity<Empl_Data> getEmpl_dataById(@PathVariable long id){
    Empl_Data empl_data=erepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee data not exist with this id:" + id));
  return ResponseEntity.ok(empl_data);
  }

  //build update employee REST API
  @PutMapping("{id}")
  public ResponseEntity<Empl_Data> updateempl(@PathVariable long id, @RequestBody Empl_Data empldetails ){
    Empl_Data updateempl = erepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(" Employe not exist with this ID" + id));
    updateempl.setFirstName(empldetails.getFirstName());
    updateempl.setLastName(empldetails.getLastName());
    updateempl.setEmailId(empldetails.getEmailId());
    erepo.save(updateempl);
    return ResponseEntity.ok(updateempl);
  }


}



