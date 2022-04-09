package com.heraizen.erpSys.service;

import com.heraizen.erpSys.domain.Student;
import com.heraizen.erpSys.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> getAllStudent();

    List<String> getAllStudentName();

    int getPlacedStudentCount();

    List<StudentDto> getStudentBasedOnCourse(String course);

    List<StudentDto> getStudentBasedOnBranch(String branch);

    List<StudentDto> getStudentBasedOnCourseAndBranch(String course, String branch);

    StudentDto getStudentWithHighestResult();

    int getSuccessRate();

    Double getAverageResult();

    Map<String, Integer> getBranchWithPlacedStudentCount();

    Map<String, Double> getAverageBasedOnBranch();

}
