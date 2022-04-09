package com.heraizen.erpSys.domain;

import lombok.*;

@Data
@Builder
public class Student {

    private String name;
    private String email;
    private Long phone;
    private String course;
    private String branch;
    private String placed;
    private Double result;

}
