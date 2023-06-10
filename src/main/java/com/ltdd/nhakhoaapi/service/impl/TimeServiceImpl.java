package com.ltdd.nhakhoaapi.service.impl;


import com.ltdd.nhakhoaapi.model.Time;
import com.ltdd.nhakhoaapi.repository.TimeRepository;
import com.ltdd.nhakhoaapi.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Override
    public Page<Time> findAll(Pageable pageable) {
        return timeRepository.findAll(pageable);
    }

    @Override
    public Page<Time> findByPeriodContaining(String period, Pageable pageable) {
        return timeRepository.findByPeriodContaining(period, pageable);
    }
}
