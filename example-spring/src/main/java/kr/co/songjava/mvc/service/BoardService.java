package kr.co.songjava.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.repository.BoardRepository;

	
/**
 * 게시판 Service
 * @author 송자바
 * 
 * 
 * */
@Service
public class BoardService {
	
	@Autowired
	private BoardRepository repository;
	
	/**
	 * 리스트 처리
	 * @return getList
	 * 
	 * 
	 * */
	public List<Board> getList(){
		return repository.getList();
	}
	
	/**
	 * 목록 처리
	 * @return boardSeq
	 * 
	 * 
	 * */
	public Board get(int boardSeq) {
		return repository.get(boardSeq);
	}
	
	/**
	 * 등록 처리
	 * @Param board
	 * 
	 * 
	 * */
	public void save(Board board) {
		repository.save(board);
	}
	
	/**
	 * 수정 처리
	 * @Param board
	 * 
	 * 
	 * */
	public void update(Board board) {
		repository.update(board);
	}
	
	/**
	 * 삭제 처리
	 * @Param boardSeq
	 * 
	 * 
	 * */
	public void delete(int boardSeq) {
		repository.delete(boardSeq);
	}
	
}
