package com.team4.bigtower.fileboard.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.team4.bigtower.fileboard.controller.FileBoardController;


@Service
public class FileBoardServiceImpl implements FileBoardService{
	private static final Logger logger = LoggerFactory.getLogger(FileBoardController.class);
	
	@Autowired
	private FileBoardDao fileBoardDao;
	
	public int addFileBoard(FileBoardCommand fileBoardCommand){
		String path ="";
		String fileName ="";
		File destFile = null;
		String extension = "";
		MultipartFile multipartFile = null;
		
		try {
			path = "D:\\eclipse\\workspace-sts\\bigtower-practice\\src\\main\\resources\\upload\\";
			multipartFile = fileBoardCommand.getMultipartFile();
			UUID uuid = UUID.randomUUID();
			fileName = uuid.toString().replace("-", "");
			int index = multipartFile.getOriginalFilename().lastIndexOf(".");
			extension = multipartFile.getOriginalFilename().substring(index+1);
			fileName = fileName + "." + extension ;
			destFile = new File(path+fileName);
			multipartFile.transferTo(destFile);
			
			
			fileBoardCommand.setfName(fileName);
			fileBoardCommand.setfPath(path);
			
			logger.info("{}", fileBoardCommand.toString());
		} catch (IllegalStateException e) {
			destFile.delete();
			e.printStackTrace();
		} catch (IOException e) {
			destFile.delete();
			e.printStackTrace();
		}
		
		return fileBoardDao.insertFileBoard(fileBoardCommand);
	}
	   
}
