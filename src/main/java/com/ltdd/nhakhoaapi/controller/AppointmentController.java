package com.ltdd.nhakhoaapi.controller;


import com.ltdd.nhakhoaapi.dto.AppointmentDto;
import com.ltdd.nhakhoaapi.model.Appointment;
import com.ltdd.nhakhoaapi.model.Doctor;
import com.ltdd.nhakhoaapi.model.Patient;
import com.ltdd.nhakhoaapi.model.Service;
import com.ltdd.nhakhoaapi.service.AppointmentService;
import com.ltdd.nhakhoaapi.service.DoctorService;
import com.ltdd.nhakhoaapi.service.PatientService;
import com.ltdd.nhakhoaapi.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/auth/")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;


    @PostMapping("/newAppointment")
    public ResponseEntity<?> newAppointment(@RequestBody AppointmentDto appointmentDto) {

        Doctor doctor = doctorService.findByDoctorId(appointmentDto.getDoctorId());
        Patient patient = patientService.findByPatientId(appointmentDto.getPatientId());
        Appointment appointment = new Appointment();
        appointment.setId(appointmentDto.getId());
        appointment.setPeriod(appointmentDto.getPeriod());
        appointment.setNote(appointmentDto.getNote());
        appointment.setDoctor(doctor);
        appointment.setAppointmentDate(appointmentDto.getAppointmentDate());
        appointment.setPatient(patient);
        appointmentService.save(appointment);
        return ResponseEntity.ok("successfully");
    }
    @GetMapping("/appointment/{patientId}")
    public ResponseEntity<?> getAppointmentById(@PathVariable(name = "patientId") Long patientId) {
        List<Appointment> appointments = appointmentService.findByPatientId(patientId);
        if (appointments.isEmpty()) {
            return ResponseEntity.ok("Null");
        }
        return ResponseEntity.ok(appointments);
    }
    @GetMapping("/appointments/{id}")
    public ResponseEntity<?> findAppointmentById(@PathVariable(name = "id") Long id) {
       Optional<Appointment> appointments = appointmentService.findById(id);
        if (appointments.isEmpty()) {
            return ResponseEntity.ok("null");
        }

        return ResponseEntity.ok(appointments);
    }

}
