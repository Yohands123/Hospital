package com.example.HospitalManagementapllication.Repository;

import com.example.HospitalManagementapllication.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can add custom query methods here if needed
}
