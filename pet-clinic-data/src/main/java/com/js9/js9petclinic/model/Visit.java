package com.js9.js9petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Pet pet;
}
