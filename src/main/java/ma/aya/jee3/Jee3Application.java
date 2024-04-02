package ma.aya.jee3;

import ma.aya.jee3.entities.Patient;
import ma.aya.jee3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Jee3Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(Jee3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"Aya",new Date(),false,10));
        patientRepository.save(new Patient(null,"Douaa",new Date(),true,20));
        patientRepository.save(new Patient(null,"Hiba",new Date(),true,30));


    }
}

