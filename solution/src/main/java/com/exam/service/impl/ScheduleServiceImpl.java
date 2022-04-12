package com.exam.service.impl;

import com.exam.model.exam.Schedule;
import com.exam.repo.ScheduleRepository;
import com.exam.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository categoryRepository;

    @Override
    public Schedule addScheduler(Schedule schedule) {
        return this.categoryRepository.save(schedule);
    }

    @Override
    public Schedule updateScheduler(Schedule schedule) {
        return this.categoryRepository.save(schedule);
    }
    @Override
    public Schedule getScheduler(Long sID) {
        return this.categoryRepository.findById(sID).get();
    }

    @Override
    public void deleteScheduler(Long sID) {
        Schedule category = new Schedule();
        category.setCid(sID);
        this.categoryRepository.delete(category);
    }
}
