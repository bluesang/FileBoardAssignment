package com.team4.bigtower.fileboard.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileBoardDaoImpl implements FileBoardDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String FILEBOARD_NS = "fileBoard.";
	
	
	@Override
	public int insertFileBoard(FileBoardCommand fileBoardCommand) {
		return sqlSession.insert(FILEBOARD_NS+"fileAdd", fileBoardCommand);
	}

}
