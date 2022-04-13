package com.heraizen.erpSys.service;

import com.heraizen.erpSys.domain.Student;
import com.heraizen.erpSys.dto.StudentDto;
import com.heraizen.erpSys.util.CsvReaderUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{

    private static StudentServiceImpl obj;

    List<Student> students = new ArrayList<>();

    private StudentServiceImpl() {
        students = CsvReaderUtil.readDataFromCsvFile();
    }

    public static StudentServiceImpl getInstance() {
        System.out.println("Accessed getInstance()");
        if (obj == null) {
            synchronized (StudentServiceImpl.class) {
                System.out.println("Created Object");
                obj = new StudentServiceImpl();
            }
        }
        return obj;
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public List<String> getAllStudentName() {
        return null;
    }

    @Override
    public int getPlacedStudentCount() {
        return 0;
    }

    @Override
    public List<StudentDto> getStudentBasedOnCourse(String course) {
        return null;
    }

    @Override
    public List<StudentDto> getStudentBasedOnBranch(String branch) {
        return null;
    }

    @Override
    public List<StudentDto> getStudentBasedOnCourseAndBranch(String course, String branch) {
        return null;
    }

    @Override
    public StudentDto getStudentWithHighestResult() {
        return null;
    }

    @Override
    public int getSuccessRate() {
        return 0;
    }

    @Override
    public Double getAverageResult() {
        return null;
    }

    @Override
    public Map<String, Integer> getBranchWithPlacedStudentCount() {
        return null;
    }

    @Override
    public Map<String, Double> getAverageBasedOnBranch() {
        return null;
    }
}
