package com.example.TaskManager.models.status;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

//@Entity
@AllArgsConstructor
public class Status {
//    @Id
    private Long id;
    private String name;
}
