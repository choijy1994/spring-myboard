package com.mycompany.myapp.dao;

import com.mycompany.myapp.vo.BoardVO;

public interface BoardDAO {
	
	public void write(BoardVO boardVO) throws Exception;
}
