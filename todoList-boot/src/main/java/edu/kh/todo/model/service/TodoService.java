package edu.kh.todo.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.todo.model.dto.Todo;

public interface TodoService {

	
	/** 할 일 목록 + 완료된 할 일 개수 조회
	 * @return map
	 */
	Map<String, Object> selectAll();

	/** 할 일 추가
	 * @param todoTitle
	 * @param todoContent
	 * @return result
	 */
	int addTodo(String todoTitle, String todoContent);

	
	/** 할 일 상세조회
	 * @param todoNo
	 * @return todo
	 */
	Todo todoDetail(int todoNo);

	/** 할 일 삭제
	 * @param todoNo : 삭제할 일 번호(PK)
	 * @param ra : 리다이렉트시 1회성으로 데이터 전달하는 객체 
	 * @return todo
	 */
	int todoDelete(int todoNo);

	
	/** 할 일 수정
	 * @param todo
	 * @return result
	 */
	int todoUpdate(Todo todo);

	/** 완료 여부 수정
	 * @param todo
	 * @return result
	 */
	int changeComplete(Todo todo);

	
	/** 전체 할 일 개수 조회
	 * @return totalCount
	 */
	int getTotalCount();

	
	/** 완료된 할 일 개수 조회
	 * @return completeCount
	 */
	int getCompleteCount();

	
	/** 할 일 목록 조회
	 * @return todolist
	 */
	List<Todo> selectList();

	

}
