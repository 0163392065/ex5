package com.choa.ex5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;
import com.choa.member.teacher.TeacherDAOImpl;
import com.choa.member.teacher.TeacherDTO;

public class TeacherDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	private static TeacherDTO teacherDTO;
	
	@Test
	public void test() throws Exception{
		int result = teacherDAOImpl.memberJoin(teacherDTO);
		assertEquals(1, result);
	}
	
	@BeforeClass
	public static void makeStudent() {
		teacherDTO = new TeacherDTO();
		teacherDTO.setId("choao11T");
		teacherDTO.setPw("choao");
		teacherDTO.setName("choao");
		teacherDTO.setAge(300);
		teacherDTO.setGrade("t");
		teacherDTO.setFname("fname");
		teacherDTO.setOriname("oriname");
		teacherDTO.setTid("choa11T");
		teacherDTO.setSubject("ENG");

	}

}
