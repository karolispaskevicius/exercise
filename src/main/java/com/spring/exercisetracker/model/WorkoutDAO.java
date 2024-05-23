package com.spring.exercisetracker.model;

import java.time.LocalDate;

public interface WorkoutDAO {
    Long getId(Long id);
    void setId(Long id);
    String getType(String type);
    void setType(String type);
    int getDuration(int duration);
    void setDuration(int duration);
    String getIntensity(String intensity);
    void setIntensity(String intensity);
    LocalDate getDate(LocalDate date);
    void setDate(LocalDate date);
}
