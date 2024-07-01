package com.microJava.microservice_java.repository;

import com.microJava.microservice_java.model.Fam_Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FamAcc_Repo extends JpaRepository<Fam_Account,Long> {

    @Query(" SELECT u.Total_Balance FROM Fam_Account u WHERE u.Account_Number =:a")
    public long getTotalBal(@Param("a") String account_number);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(" UPDATE Fam_Account f SET f.Total_Balance =:t WHERE f.Account_Number=:a")
    public void setTotalBal(@Param("a") String account_number,@Param("t") long total_balance);

//    @ Query(value="select total_balance FROM family_account WHERE account_number =:a" , nativeQuery = true)
//    public long getTotalBal(@Param("a") String accno);
}
