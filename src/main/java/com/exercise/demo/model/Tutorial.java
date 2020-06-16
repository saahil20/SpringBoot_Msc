package com.exercise.demo.model;

import java.util.UUID;

public class Tutorial {
    private final UUID id;
    private final String title;
    private final String description;
    private final String status;

    public Tutorial(UUID id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public UUID getId() {
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
