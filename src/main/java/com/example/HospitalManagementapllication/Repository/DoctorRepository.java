package com.example.HospitalManagementapllication.Repository;

import com.example.HospitalManagementapllication.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Custom methods if needed
}
