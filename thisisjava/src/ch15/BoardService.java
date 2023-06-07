package ch15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch15.sec02.exam01.Board;

public class BoardService {

	// 공지사항, 뉴스, 자료실 글을 리턴
	public Map<String, List<Board>> getBoard() {
		Map<String, List<Board>> map = new HashMap<>();
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board("공지사항 제목1", "공지사항 내용1", "작성자"));
		list.add(new Board("공지사항 제목2", "공지사항 내용2", "작성자"));
		list.add(new Board("공지사항 제목3", "공지사항 내용3", "작성자"));
		map.put("notice", list);
		
		list = new ArrayList<Board>();
		list.add(new Board("뉴스 제목1", "뉴스 내용1", "작성자"));
		list.add(new Board("뉴스 제목2", "뉴스 내용2", "작성자"));
		list.add(new Board("뉴스 제목3", "뉴스 내용3", "작성자"));
		map.put("news", list);
		
		list = new ArrayList<Board>();
		list.add(new Board("자료실 제목1", "자료실 내용1", "작성자"));
		list.add(new Board("자료실 제목2", "자료실 내용2", "작성자"));
		list.add(new Board("자료실 제목3", "자료실 내용3", "작성자"));
		map.put("data", list);
		
		int[] arr = {1,2,3};
		List arr2 = List.of(arr, arr, arr);
		System.out.println(arr2.size());
		for (int i=0; i<arr2.size(); i++) {
			System.out.println(i);
		}
		
		return map;
	}
}
