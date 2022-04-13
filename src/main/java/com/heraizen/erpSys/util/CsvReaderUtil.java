package com.heraizen.erpSys.util;

import com.heraizen.erpSys.domain.Student;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CsvReaderUtil {

    private static final String fileName = "students.csv";

    private CsvReaderUtil() {

    }

    public static List<Student> readDataFromCsvFile() {
        List<Student> studentList = new ArrayList<>();
        try {
            List<String> csvLines = Files.readAllLines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()));
            studentList = csvLines.stream().skip(1).map(line -> getDataAsStudent(line)).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    private static Student getDataAsStudent(String line) {
        String[] splitLine = line.split(",");
        int i = 0;
        String name = splitLine[i++];
        String email = splitLine[i++];
        Long phone = Long.parseLong(splitLine[i++]);
        String course = splitLine[i++];
        String branch = splitLine[i++];
        String placed = splitLine[i++];
        Double result = Double.parseDouble(splitLine[i++]);
        return Student.builder().name(name).phone(phone).result(result).email(email).branch(branch).placed(placed).course(course).build();

    }


}
