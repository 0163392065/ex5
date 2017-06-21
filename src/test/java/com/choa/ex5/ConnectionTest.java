package com.choa.ex5;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.member.MemberDTO;
import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;

public class ConnectionTest extends MyAbstractTestUnit{

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	/*@Test
	public void test() {
		assertNotNull(sqlSession);
	}*/
	
	@Test
	public void test() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("choao10");
		memberDTO.setPw("choao");
		memberDTO.setName("choao");
		memberDTO.setAge(28);
		memberDTO.setGrade("s");
		memberDTO.setFname("fname");
		memberDTO.setOriname("oriname");
/*		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId("choao10");
		studentDTO.setPw("choao");
		studentDTO.setName("choao");
		studentDTO.setAge(28);
		studentDTO.setGrade("s");
		studentDTO.setFname("fname");
		studentDTO.setOriname("oriname");
		studentDTO.setSid("choao");
		studentDTO.setTid("choa");
		studentDTO.setPhone("01065432145");*/
		
		int result = studentDAOImpl.memberJoin(memberDTO);
		
		System.out.println("result : "+result);
		assertEquals(1, result);
		
	}

}
