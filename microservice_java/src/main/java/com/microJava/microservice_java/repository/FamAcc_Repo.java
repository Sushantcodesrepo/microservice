package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.Fam_Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamAcc_Repo extends JpaRepository<Fam_Account,Long> {
}
