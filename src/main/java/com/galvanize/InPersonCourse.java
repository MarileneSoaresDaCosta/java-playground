package com.galvanize;

import java.util.List;

class InPersonCourse extends Course {
    private static String teacher;

    InPersonCourse(List<String> students, String teacher) {
        super(students);
        this.teacher = teacher;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " (taught by " + this.teacher + ")";
    }

    static class Nested {
        public static void getTeacher(){
            System.out.println("from nested accessed: " + teacher);
        }

    }
}
