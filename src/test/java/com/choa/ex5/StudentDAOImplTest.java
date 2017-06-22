package com.choa.ex5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstractTestUnit;
import com.choa.member.MemberDTO;
import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

public class StudentDAOImplTest extends MyAbstractTestUnit {

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception {
		
		StudentDTO memberDTO=(StudentDTO)studentDAOImpl.test(studentDTO);
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getPhone());
	}
	
	@BeforeClass
	public static void makeStudent(){
		String data="a1";
		studentDTO = new StudentDTO();
		studentDTO.setId(data);
		studentDTO.setPw(data);
		studentDTO.setName(data);
		studentDTO.setAge(20);
		studentDTO.setGrade("student");
		studentDTO.setFilename(data);
		studentDTO.setOriname(data);
		studentDTO.setPhone(data);
		studentDTO.setTid(data);
		
	}
	
	

}
