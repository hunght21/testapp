package com.ltdd.nhakhoaapi.service;

import com.ltdd.nhakhoaapi.model.Doctor;
import com.ltdd.nhakhoaapi.model.Specialist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ServiceService {

    Page<com.ltdd.nhakhoaapi.model.Service> findAll(Pageable pageable);

//    Page<com.ltdd.nhakhoaapi.model.Service> findByServiceListNameContaining(String specialistName, Pageable pageable);

    Optional<com.ltdd.nhakhoaapi.model.Service> findByDoctorId(Long serviceId);
}
