package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping("/member/**")
public class TeacherController {
	
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	//login
	@RequestMapping(value="teacherLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		System.out.println("teacherController");
		memberDTO = teacherServiceImpl.memberLogin(memberDTO);
		
		String message = "로그인 실패";
		if(memberDTO != null){
			message = "로그인 성공";
			session.setAttribute("member", memberDTO);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("path", "../");
		mv.addObject("message", message);
		mv.setViewName("commons/result");		
		return mv;
	}
	
	//join
	@RequestMapping(value="teacherJoin", method=RequestMethod.POST)
	public String memberJoin(TeacherDTO teacherDTO, Model model, HttpSession session) throws Exception{
		System.out.println("teacherController");
		int result = teacherServiceImpl.memberJoin(teacherDTO, session);
		
		String message = "가입 실패";
		if(result > 0){
			message = "가입 성공";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		
		
		return "commons/result";
	}

}
