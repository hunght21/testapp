package com.ltdd.nhakhoaapi.dto;


import com.ltdd.nhakhoaapi.model.Specialist;
import com.ltdd.nhakhoaapi.model.Time;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {

    private Long doctorId;

    private String name;

    private String avatar;

    private String email;

    private String phone;

    private String speciality;

    private Specialist specialist;

    private Collection<Time> times;
}
