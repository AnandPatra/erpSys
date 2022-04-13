package com.heraizen.erpSys.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private String name;
    private String email;
    private long phone;
    private String course;
    private String branch;
    private String placed;
    private double result;

}