package com.valsight.testtask.domain;

import java.util.Set;

public class Dimension {

    private String name;
    private String description;
    private Set<Level> level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Level> getLevel() {
        return level;
    }

    public void setLevel(Set<Level> level) {
        this.level = level;
    }
}
