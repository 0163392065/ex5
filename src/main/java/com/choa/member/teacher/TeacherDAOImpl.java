package com.choa.member.teacher;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;

@Repository
public class TeacherDAOImpl implements MemberDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="TeacherMapper.";
	private final String NAMESPACE2="MemberMapper.";
	
	public MemberDTO test(MemberDTO memberDTO){
		return sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
	}
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		sqlSession.insert(NAMESPACE2+"joinMember", memberDTO);
		int result= sqlSession.insert(NAMESPACE+"joinTeacher", memberDTO);
		return result;
	}

	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		MemberDTO mDto = sqlSession.selectOne(NAMESPACE2+"loginMember", memberDTO);
		return mDto;
	}

	@Override
	public MemberDTO memberPage(String id) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
