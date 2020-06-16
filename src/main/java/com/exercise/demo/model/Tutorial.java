package com.exercise.demo.model;

public class Tutorial {
    private final int id;
    private final String title;
    private final String description;
    private final String status;


    public Tutorial(int id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
