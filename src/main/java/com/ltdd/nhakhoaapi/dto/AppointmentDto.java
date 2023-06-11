package com.ltdd.nhakhoaapi.dto;


import com.ltdd.nhakhoaapi.model.Service;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppointmentDto {

    private Long id;

    private String appointmentDate;

    private String period;

    private String note;

    private Long patientId;

    private Long doctorId;

 //   private List<Service> services;


}
