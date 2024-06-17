package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.Empl_Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Empl_Repo extends JpaRepository<Empl_Data, Long> {
    //all crud operations will perform here.
}
