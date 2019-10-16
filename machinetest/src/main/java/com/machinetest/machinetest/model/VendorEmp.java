package com.machinetest.machinetest.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@JsonSerialize
@Entity

public class VendorEmp extends BaseModel {


    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employeeid_id")
    private Employee employee;

    private String VendorName;
    private Long vendorPeriod;

}
