package com.choa.ex5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

public class StudentDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception{
		int result = studentDAOImpl.memberJoin(studentDTO);
		assertEquals(1, result);
	}
	
	@BeforeClass
	public static void makeStudent() {
		studentDTO = new StudentDTO();
		studentDTO.setId("choao10a1");
		studentDTO.setPw("choao");
		studentDTO.setName("choao");
		studentDTO.setAge(280);
		studentDTO.setGrade("s");
		studentDTO.setFname("fname");
		studentDTO.setOriname("oriname");
		studentDTO.setSid("choao10a1");
		studentDTO.setTid("choa");
		studentDTO.setPhone("01065432145");

	}

}
