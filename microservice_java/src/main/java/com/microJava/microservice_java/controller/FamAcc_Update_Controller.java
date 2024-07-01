package com.microJava.microservice_java.controller;


import com.microJava.microservice_java.exception.ResourceNotFoundException;
import com.microJava.microservice_java.model.FamAcc_Update;
import com.microJava.microservice_java.model.Fam_Data;
import com.microJava.microservice_java.repository.FamAccUpdate_Repo;
import com.microJava.microservice_java.repository.FamAcc_Repo;
import com.microJava.microservice_java.repository.Fam_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v4/fundmanager")
@RestController
public class FamAcc_Update_Controller {
    @Autowired
    private FamAcc_Repo faRepo;
    @Autowired
    private FamAccUpdate_Repo fauRepo;

@PostMapping
public FamAcc_Update addBal(@RequestBody FamAcc_Update famacc_Update){
    famacc_Update.setMoney_Debited(0);
    LocalDate date = LocalDate.now();
    LocalTime time =LocalTime.now();
    famacc_Update.setUpdate_Date(date);
    famacc_Update.setUpdate_Time(time);
    long l= famacc_Update.getMoney_Credited();
    l+=faRepo.getTotalBal(famacc_Update.getAccount_Number());
    faRepo.setTotalBal(famacc_Update.getAccount_Number(),l);
    famacc_Update.setTotal_Balance(l);
    fauRepo.save(famacc_Update);


    return famacc_Update;
}

@GetMapping("{Account_Number}")
public List<FamAcc_Update> getFam_dataById(@PathVariable("Account_Number") String an){
    List<FamAcc_Update> famAcc_Data=new ArrayList<>();
    famAcc_Data.addAll(fauRepo.getAllTransaction(an));
    return famAcc_Data;
}



}
