package com.ltdd.nhakhoaapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "service")
@AllArgsConstructor
@NoArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name")
    private String name;

    @Column(name = "service_time")
    private Integer time;

    @Column(name = "service_detail")
    private String detail;

    @Column(name = "service_price", columnDefinition = "DECIMAL(8, 2)")
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer = 6, fraction = 2)
    private Double price;

    @ManyToMany(mappedBy = "services", fetch = FetchType.EAGER)
    private List<Appointment> appointmentList;

    public Service(String name, Integer time, Double price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }
}
