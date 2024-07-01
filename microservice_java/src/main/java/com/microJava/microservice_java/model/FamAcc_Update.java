package com.microJava.microservice_java.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Fam_Acc_Update")
public class FamAcc_Update {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Account_Number",nullable = false)
    private String Account_Number;

    @Column(name = "Update_Date")
    private LocalDate Update_Date;

    @Column(name = "Update_time")
    private LocalTime Update_Time;

    @Column(name = "Money_Credited")
    private long Money_Credited;

    @Column(name = "Money_Debited")
    private long Money_Debited;

    @Column(name = "Total_Balance")
    private long Total_Balance;

}
