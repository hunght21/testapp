package com.ltdd.nhakhoaapi.dto;


import com.ltdd.nhakhoaapi.model.Doctor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecialistDto {

    private Long specialistId;
    private String specialistName;
    private String sign;
    private Collection<Doctor> doctors;
}
