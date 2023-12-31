package com.ltdd.nhakhoaapi.repository;


import com.ltdd.nhakhoaapi.model.Appointment;
import com.ltdd.nhakhoaapi.model.Doctor;
import com.ltdd.nhakhoaapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByPatient(Patient patient);

    List<Appointment> findByDoctor(Doctor doctor);
    @Query(value = "select appointment.* from appointment join patient on appointment.patient_id = patient.patient_id where appointment.patient_id=?1", nativeQuery = true)
    List<Appointment> findByPatientId(Long patientId);

}
