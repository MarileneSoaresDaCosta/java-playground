package com.galvanize;

import java.util.List;
import java.util.stream.Collectors;

class Course {
    private final List<String> students;

    //constructor
    Course(List<String> students) {
        this.students = students;
    }

    public String getDescription() {
        return String.join(", ", students);
    }
}