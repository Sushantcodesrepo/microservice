package com.microJava.microservice_java;

import com.microJava.microservice_java.model.Empl_Data;
import com.microJava.microservice_java.model.Fam_Data;
import com.microJava.microservice_java.repository.Empl_Repo;
import com.microJava.microservice_java.repository.Fam_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceJavaApplication.class, args);
	}
    @Autowired
	private Empl_Repo emplRepo;

	@Autowired
	private Fam_Repo famRepo;
	@Override
	public void run(String... args) throws Exception {
//		Empl_Data empl=new Empl_Data();
//		empl.setFirstName("Rohan");
//		empl.setLastName("kumar");
//		empl.setId(11222);
//		empl.setEmailId("rohantoaws@gmail.com");
//		emplRepo.save(empl);
//
//		Empl_Data empl1=new Empl_Data();
//		empl1.setFirstName("Rohan1");
//		empl1.setLastName("kumar2");
//		empl1.setId(1122255);
//		empl1.setEmailId("rohantoaws@yahoo.com");
//		emplRepo.save(empl1);

//		Fam_Data f= new Fam_Data();
//		f.setFirst_Name("sushant");
//		f.setLast_Name("sourav");
//		f.setSon_Of("amar");
//		f.setAge(25);
//		f.setPhone_No("7004192941");
//		famRepo.save(f);


	}
}
