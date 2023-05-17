package com.cailangrott.cinemax.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class User {
    private String name;
    private LocalDate birthDate;
    private Boolean isStudent;
}
