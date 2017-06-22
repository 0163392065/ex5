package com.choa.ex5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;
import com.choa.member.teacher.TeacherDAOImpl;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

public class TeacherDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	private static TeacherDTO teacherDTO;
	
	@Test
	public void test() throws Exception {
		TeacherDTO memberDTO=(TeacherDTO)teacherDAOImpl.test(teacherDTO);
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getSubject());
	}
	
	@BeforeClass
	public static void makeStudent(){
		String data="hani";
		teacherDTO = new TeacherDTO();
		teacherDTO.setId(data);
		teacherDTO.setPw(data);
		teacherDTO.setName(data);
		teacherDTO.setAge(20);
		teacherDTO.setGrade("teacher");
		teacherDTO.setFilename(data);
		teacherDTO.setOriname(data);
		teacherDTO.setSubject("math");
		
		
	}

}
