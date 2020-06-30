package com.mycompany.myapp.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.mycompany.myapp.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	@Inject
	private SqlSession sqlSession;
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert",boardVO);

	}

}
