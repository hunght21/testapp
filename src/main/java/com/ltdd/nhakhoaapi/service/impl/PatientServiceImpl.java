package com.ltdd.nhakhoaapi.service.impl;


import com.ltdd.nhakhoaapi.model.Patient;
import com.ltdd.nhakhoaapi.repository.PatientRepository;
import com.ltdd.nhakhoaapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;


    @Override
    public <S extends Patient> S save(S entity) {
        return patientRepository.save(entity);
    }

    @Override
    public Optional<Patient> findById(Long aLong) {
        return patientRepository.findById(aLong);
    }

    @Override
    public boolean existsPatientByPhone(Long phone) {
        return patientRepository.existsPatientByPhone(phone);
    }

    @Override
    public boolean existsPatientByIdCard(String idCard) {
        return patientRepository.existsPatientByIdCard(idCard);
    }

    @Override
    public Patient findByPatientId(Long id) {
        return patientRepository.findByPatientId(id);
    }

    @Override
    public Patient findByEmailAndPassword(String email, String password) {
        return patientRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public Patient findByEmail(String email) {
        return patientRepository.findByEmail(email);
    }
}
