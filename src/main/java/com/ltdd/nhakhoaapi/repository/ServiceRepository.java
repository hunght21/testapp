package com.ltdd.nhakhoaapi.repository;

import com.ltdd.nhakhoaapi.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
//    Page<Service> findByServiceListNameContaining(String serviceListName, Pageable pageable);
}
