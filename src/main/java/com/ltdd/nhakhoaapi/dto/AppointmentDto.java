package com.ltdd.nhakhoaapi.dto;


import lombok.*;

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


}
