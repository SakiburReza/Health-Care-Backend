package com.health_care.backend.Patient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return service.savePatient(patient);
    }
    @GetMapping("/patient-id/{id}")
    public Optional<Patient> getPatientById(@PathVariable int id){
        return service.findPatientById(id);
    }
    @PutMapping("/updatePatientByHeightWeight")
    public void updateByHW(@RequestBody Patient patient){
        service.updateByHW(patient);
    }
   
 
}
