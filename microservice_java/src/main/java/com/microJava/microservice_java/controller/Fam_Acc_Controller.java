package com.microJava.microservice_java.controller;

import com.microJava.microservice_java.exception.ResourceNotFoundException;
import com.microJava.microservice_java.model.Fam_Account;
import com.microJava.microservice_java.model.Fam_Data;
import  com.microJava.microservice_java.repository.FamAcc_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v4/famaccount")
public class Fam_Acc_Controller {
    @Autowired
    private FamAcc_Repo famAcc_repo;



    @GetMapping
    public List<Fam_Account> getAllFam(){
        return famAcc_repo.findAll();
    }

    @PostMapping
    public Fam_Account famCreate(@RequestBody Fam_Account fam_Acc){
        return famAcc_repo.save(fam_Acc);

    }
    @GetMapping("{id}")
    public ResponseEntity<Fam_Account> getFam_dataById(@PathVariable long id){
        Fam_Account fam_data=famAcc_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Famliy data does not exist" + id));
        return ResponseEntity.ok(fam_data);

    }


    @PutMapping("{id}")
    public ResponseEntity<Fam_Account> updateFam_data(@PathVariable long id, @RequestBody Fam_Account updatefamdetails){
        Fam_Account updatefam_data=famAcc_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Familiy data not found" +  id));
        updatefam_data.setAccount_Number(updatefamdetails.getAccount_Number());
        updatefam_data.setIFSC_Code(updatefamdetails.getIFSC_Code());
        updatefam_data.setBank_Name(updatefamdetails.getBank_Name());
        updatefam_data.setBranch_Code(updatefamdetails.getBranch_Code());
        updatefam_data.setNominee_Name(updatefamdetails.getNominee_Name());
        updatefam_data.setNominee_Relation(updatefamdetails.getNominee_Relation());
        return ResponseEntity.ok(updatefamdetails);

    }
}
