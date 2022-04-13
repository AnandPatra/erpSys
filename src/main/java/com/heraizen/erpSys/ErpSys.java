package com.heraizen.erpSys;

import com.heraizen.erpSys.domain.Student;
import com.heraizen.erpSys.service.StudentService;
import com.heraizen.erpSys.service.StudentServiceImpl;

import java.util.List;

public class ErpSys {

	public static void main(String[] args) {
		
		System.out.println("Hi welcome to ERP app");


		StudentService studentService = StudentServiceImpl.getInstance();

		//TODO:// Implement switch statement

		List<Student> students= studentService.getAllStudent();




	}

}
