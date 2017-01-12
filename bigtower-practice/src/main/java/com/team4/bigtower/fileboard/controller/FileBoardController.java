package com.team4.bigtower.fileboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.bigtower.fileboard.service.FileBoardCommand;
import com.team4.bigtower.fileboard.service.FileBoardService;

@Controller
public class FileBoardController {
	
	@Autowired
	private FileBoardService fileBoardService;
	
	@RequestMapping(value="/fileAdd", method=RequestMethod.GET)
	public String fileAdd(){
		return "/fileBoard/fileAdd";
	}
	
	@RequestMapping(value="/fileAdd", method=RequestMethod.POST)
	public String fileAdd(FileBoardCommand fileBoardCommand){
		fileBoardService.addFileBoard(fileBoardCommand);
		return "redirect:/fileList";
	}
}
