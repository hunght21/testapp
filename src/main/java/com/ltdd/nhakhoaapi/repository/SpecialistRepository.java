package com.ltdd.nhakhoaapi.repository;


import com.ltdd.nhakhoaapi.model.Specialist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    Page<Specialist> findBySpecialistNameContaining(String specialistName, Pageable pageable);
}
