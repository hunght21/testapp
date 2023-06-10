package com.ltdd.nhakhoaapi.controller;


import com.ltdd.nhakhoaapi.model.Doctor;
import com.ltdd.nhakhoaapi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    //Get all doctor
    @GetMapping("/doctors")
    public  ResponseEntity<?> getAllDoctor(@RequestParam(value = "name",required = false) String name
            ,@RequestParam(value = "page") Optional<Integer> page
            ,@RequestParam("size") Optional<Integer> size) {

        int currentPage = page.orElse(0);
        int pageSize = size.orElse(30);

        Pageable pageable = PageRequest.of(currentPage, pageSize, Sort.by("name"));
        Page<Doctor> resultPage = null;
        if (StringUtils.hasText(name)) {
            resultPage = doctorService.findByNameContaining(name, pageable);

        } else {
            resultPage = doctorService.findAll(pageable);
        }
        return ResponseEntity.ok(resultPage);
    }
    //Get doctor by id
    @GetMapping("/doctors/{id}")
    public ResponseEntity<?> getDoctorById(@PathVariable(name = "id") Long id) {
        Optional<Doctor> doctor = doctorService.findById(id);
        if (doctor.isEmpty()) {
            return ResponseEntity.ok("Null");
        }
        return ResponseEntity.ok(doctor);
    }

    @GetMapping("/doctors/times")
    public ResponseEntity<?> findDoctorsByPeriodAndSpecialist(
            @RequestParam(name = "period") String period,
            @RequestParam(name = "specialistId") Long specialistId) {
        List<Doctor> doctors = doctorService.getDoctorTime(period, specialistId);
        if(doctors.isEmpty()) {
            return ResponseEntity.ok("Null");
        }
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }


}
