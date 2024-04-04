package edu.kh.project.main.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {

	/** 비밀번호 초기화
	 * @param map
	 * @return
	 */
	int resetPw(Map<String, Object> map);

	/** 회원 탈퇴 복구
	 * @param inputNo
	 * @return
	 */
	int rollMember(int inputNo);

	/** 회원 삭제
	 * @param inputNo
	 * @return
	 */
	int deleteMember(int inputNo);

}
