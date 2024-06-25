package com.microJava.microservice_java.controller;

import com.microJava.microservice_java.exception.ResourceNotFoundException;
import com.microJava.microservice_java.model.accountData;
import com.microJava.microservice_java.repository.accountrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/api/v3/accdata")
    public class account_controller {

    @Autowired
    private accountrepo arepo;

    @GetMapping
    public List<accountData> getaccountdata(){
        return arepo.findAll();
    }


    @PostMapping
    public accountData createAccInfo(@RequestBody accountData accdata){
        return arepo.save(accdata);
    }

    @GetMapping({"id"})
    public ResponseEntity<accountData> getAccDataById(@PathVariable Long id){
        accountData accdata=arepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("account data does not exist" + id));
        return ResponseEntity.ok(accdata);
    }

    @PutMapping("{id}")
    public ResponseEntity<accountData> updateAccinfo(@PathVariable Long id, @RequestBody accountData accdata){
        accountData updateAccinfo=arepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("we can not update account info at this Id" + id));
        updateAccinfo.setAccountNumber(accdata.getAccountNumber());
        updateAccinfo.setIfscCode(accdata.getIfscCode());
        updateAccinfo.setBankName(accdata.getBankName());
        updateAccinfo.setBankName(accdata.getBranchCode());
        updateAccinfo.setNomineeName(accdata.getNomineeName());
        updateAccinfo.setNomineeRelation(accdata.getNomineeRelation());
        return ResponseEntity.ok(updateAccinfo);

    }

}
