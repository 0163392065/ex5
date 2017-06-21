package com.choa.member.teacher;

import javax.xml.crypto.Data;

import com.choa.member.MemberDTO;

public class TeacherDTO extends MemberDTO{
	private String tid;
	private String subject;
	private Data hiredate;
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Data getHiredate() {
		return hiredate;
	}
	public void setHiredate(Data hiredate) {
		this.hiredate = hiredate;
	}
	
	
}
