package com.team4.bigtower.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String MEMBER_NS = "member.";
	
	@Override
	public int memberInsert(Member member) {
		
		return sqlSession.insert(MEMBER_NS + "memberAdd", member);
	}

}
