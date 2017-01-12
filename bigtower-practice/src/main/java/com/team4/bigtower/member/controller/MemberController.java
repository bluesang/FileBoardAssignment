package com.team4.bigtower.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.bigtower.member.service.Member;
import com.team4.bigtower.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/memberAdd", method=RequestMethod.GET)
	public String memberAdd(){
		
		return "/member/memberAdd";
	}
	
	@RequestMapping(value="/memberAdd", method=RequestMethod.POST)
	public String memberAdd(Member member){
		int result = memberService.memberAdd(member);
		if(result!=0){
			return "redirect:/member/memberLogin";
		}else{
			return "/member/memberAdd";
		}
	}
	
	@RequestMapping(value="/memberLogin", method=RequestMethod.GET)
	public String memberLogin(){
		
		
		return "/member/memberLogin";
	}
}
