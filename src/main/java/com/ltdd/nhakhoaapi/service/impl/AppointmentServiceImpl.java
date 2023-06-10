package com.ltdd.nhakhoaapi.service.impl;


import com.ltdd.nhakhoaapi.model.Appointment;
import com.ltdd.nhakhoaapi.model.Doctor;
import com.ltdd.nhakhoaapi.model.Patient;
import com.ltdd.nhakhoaapi.repository.AppointmentRepository;
import com.ltdd.nhakhoaapi.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Override
    public List<Appointment> findByPatient(Patient patient) {
        return appointmentRepository.findByPatient(patient);
    }

    @Override
    public List<Appointment> findByDoctor(Doctor doctor) {
        return appointmentRepository.findByDoctor(doctor);
    }

    @Override
    public <S extends Appointment> S save(S entity) {
        return appointmentRepository.save(entity);
    }

    @Override
    public Optional<Appointment> findById(Long aLong) {
        return appointmentRepository.findById(aLong);
    }

    @Override
    public List<Appointment> findByPatientId(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }
}
