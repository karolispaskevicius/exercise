package com.spring.exercisetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

public class WorkoutImpl implements WorkoutDAO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private int duration; //seconds , rounds
    private String intensity;
    private LocalDate date;

    //Indicates that the WorkoutImpl entity, has a many-to-one relationship with the 'User' entity.
    @ManyToOne
    //Specifies that 'user_id' column in the 'workouts' table is a foreign key referencing to 'id' in 'users' table.
    //Tells JPA to use this column to join the Workout entity with the User entity.
    @JoinColumn(name = "user_id")
    private UserDAOImpl user;

    @Override
    public Long getId(Long id) {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getType(String type) {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getDuration(int duration) {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String getIntensity(String intensity) {
        return intensity;
    }

    @Override
    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @Override
    public LocalDate getDate(LocalDate date) {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
