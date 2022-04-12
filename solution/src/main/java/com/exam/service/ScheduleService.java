package com.exam.service;

import com.exam.model.exam.Schedule;

import java.util.Set;

public interface ScheduleService {
    public Schedule addScheduler(Schedule schedule);

    public Schedule updateScheduler(Schedule schedule);

//    public Set<Schedule> getScheduler();

    public Schedule getScheduler(Long sId);

    public void deleteScheduler(Long sId);
}
