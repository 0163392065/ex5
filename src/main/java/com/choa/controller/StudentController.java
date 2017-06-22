package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.member.MemberDTO;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping("/member/**")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("memberJoin")
	public void memberJoin(){}
	
	@RequestMapping("memberLogin")
	public void memberLogin(){}
	
	@RequestMapping(value="memberLogout")
	public String memberLogout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value="memberPage", method=RequestMethod.GET)
	public void memberPage(HttpSession session, Model model) throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		MemberDTO memberDTO2 = studentServiceImpl.memberPage(memberDTO);
		model.addAttribute("student", memberDTO2);
	}
	
	@RequestMapping(value="studentLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, HttpSession session)throws Exception{
		System.out.println("start");
		memberDTO=studentServiceImpl.memberLogin(memberDTO);
		
		String message="Login Fail";
		if(memberDTO != null){
			message="Login Success";
			session.setAttribute("member", memberDTO);
		}
		String path="../";
		ModelAndView mv = new ModelAndView();
		mv.addObject("path", path);
		mv.addObject("message", message);
		mv.setViewName("commons/result");
		
		return mv;
	}
	
	
	@RequestMapping(value="/studentJoin", method=RequestMethod.POST)
	public String memberJoin(StudentDTO studentDTO, Model model, HttpSession session) throws Exception{
		
		int result = studentServiceImpl.memberJoin(studentDTO, session);
		String message="가입 실패";
		if(result>0){
			message="가입 성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		return "commons/result";
	}
	
}
