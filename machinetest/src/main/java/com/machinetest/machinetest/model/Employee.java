package com.machinetest.machinetest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table(name="employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee extends BaseModel {

    private String name;
    private String employeeNumber;
    private String address;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private FullTimeEmp fullTimeEmp;


    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private VendorEmp vendorEmp;



    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public FullTimeEmp getFullTimeEmp() {
        return fullTimeEmp;
    }

    public void setFullTimeEmp(FullTimeEmp fullTimeEmp) {
        this.fullTimeEmp = fullTimeEmp;
    }

    public VendorEmp getVendorEmp() {
        return vendorEmp;
    }

    public void setVendorEmp(VendorEmp vendorEmp) {
        this.vendorEmp = vendorEmp;
    }
}
