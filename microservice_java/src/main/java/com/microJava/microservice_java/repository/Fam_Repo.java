package com.microJava.microservice_java.repository;


import com.microJava.microservice_java.model.Fam_Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Fam_Repo extends JpaRepository<Fam_Data,Long> {
}
