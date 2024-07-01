package com.microJava.microservice_java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "family_account")
public class Fam_Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Account_Holder_Name")
    private String Account_Holder_Name;

    @Column(name = "Account_Number")
    private String Account_Number;

    @Column(name = "IFSC_Code")
    private String IFSC_Code;

    @Column(name = "Bank_Name")
    private String Bank_Name;

    @Column(name ="Branch_Code")
    private int Branch_Code;

    @Column(name="Nominee_Name")
    private String Nominee_Name;

    @Column(name="Nominee_Relation")
    private String Nominee_Relation;

    @Column(name="Total_Balance")
    private long Total_Balance;
}
