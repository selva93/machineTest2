package com.machinetest.machinetest.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@JsonSerialize
@Entity

public class FullTimeEmp extends BaseModel {


    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private Employee employee;

    private String dateOfJoining;
    private Long insuranceNumber;
}
