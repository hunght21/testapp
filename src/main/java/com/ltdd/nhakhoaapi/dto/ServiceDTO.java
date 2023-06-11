package com.ltdd.nhakhoaapi.dto;

import com.ltdd.nhakhoaapi.model.Appointment;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDTO {

    private String name;

    private String detail;

 //   private List<Appointment> appointments;
}
