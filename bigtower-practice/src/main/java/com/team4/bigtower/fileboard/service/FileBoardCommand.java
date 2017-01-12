package com.team4.bigtower.fileboard.service;

import org.springframework.web.multipart.MultipartFile;

public class FileBoardCommand {
	private int fNo;
	private String fName;
	private String fPath;
	private MultipartFile multipartFile;
	
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfPath() {
		return fPath;
	}
	public void setfPath(String fPath) {
		this.fPath = fPath;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
	@Override
	public String toString() {
		return "FileBoardCommand [fNo=" + fNo + ", fName=" + fName + ", fPath=" + fPath + ", multipartFile="
				+ multipartFile + "]";
	}
	
	
	
	
		
}
