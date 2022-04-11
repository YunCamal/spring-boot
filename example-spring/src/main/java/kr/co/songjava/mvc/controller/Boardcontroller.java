package kr.co.songjava.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.service.BoardService;
/**
 * 게시판 Controller
 * @author 송자바
 * 
 * 
 * */
@RestController
@RequestMapping("/board")
public class Boardcontroller {
	
	
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 리스트 처리
	 * @return getList
	 * 
	 * 
	 * */
	@GetMapping
	public List<Board> getList(){
		return boardService.getList();
	}
	
	/**
	 * 목록 처리
	 * @return boardSeq
	 * 
	 * 
	 * */
	@GetMapping("/{boardSeq}")
	public Board get(@PathVariable int boardSeq) {
		return boardService.get(boardSeq);
	}
	
	/**
	 * 등록,수정 처리
	 * @Param board
	 * 
	 * 
	 * */
	@GetMapping("/save")
	public void save(Board board) {
		boardService.save(board);
	}
	

	/**
	 * 삭제 처리
	 * @Param boardSeq
	 * 
	 * 
	 * */
	@GetMapping("/delete/{boardSeq}")
	public void delete(@PathVariable int boardSeq) {
		boardService.delete(boardSeq);
	}
	
}
