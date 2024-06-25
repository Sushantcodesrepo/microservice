package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.Empl_Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Empl_Repo extends JpaRepository<Empl_Data, Long> {
    //all crud operations will perform here.

//    @Query("select * from scehma.tablen where id=?")
//    void setTable(String id);
}
