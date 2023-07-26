package com.js9.js9petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate dateOfBirth;
}
