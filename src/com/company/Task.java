package com.company;

import java.util.List;
import java.util.Scanner;

public class Task {
    private String title;
    private String description;
    private int priority;

    Task(String title, String description, int priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void update(String updatedTitle, String updatedDescription, int updatedPriority){
        this.title = updatedTitle;
        this.description = updatedDescription;
        this.priority = updatedPriority;

    }

    public void display(){
            System.out.println("The task title is " + title + ". The task description is "
                    + description + ". The priority is " + priority + ".");


    }


}
