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
@Table(name = "accountData")
public class accountData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private long id;

    @Column(name="accountNumber")
    private String accountNumber;

    @Column(name="ifscCode")
    private String ifscCode;

    @Column(name="bankName")
    private String bankName;

    @Column(name ="branchCode")
    private String branchCode;

    @Column(name= "nomineeName")
    private String nomineeName;

    @Column(name="nomineeRelation")
    private String nomineeRelation;

}
