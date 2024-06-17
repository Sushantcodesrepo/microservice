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
@Table(name = "famliy_details")
public class Fam_Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "First_Name")
    private String First_Name;

    @Column(name = "Last_Name")
    private String Last_Name;

    @Column(name = "Son_Of")
    private String Son_Of;

    @Column(name ="Age")
    private int Age;

    @Column(name="Phone_No")
    private String Phone_No;
}
