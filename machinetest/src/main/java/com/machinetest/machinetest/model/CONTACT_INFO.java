package com.machinetest.machinetest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contact_info")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CONTACT_INFO extends BaseModel {

}
