package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.FamAcc_Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FamAccUpdate_Repo extends JpaRepository<FamAcc_Update,Long> {

    @Query(" SELECT u FROM FamAcc_Update u WHERE u.Account_Number =:a")
    public List<FamAcc_Update> getAllTransaction(@Param("a") String account_number);
}
