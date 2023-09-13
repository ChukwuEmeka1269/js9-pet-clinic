package com.js9.js9petclinic.model;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;
}
