package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.accountData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accountrepo extends JpaRepository<accountData,Long> {

}
