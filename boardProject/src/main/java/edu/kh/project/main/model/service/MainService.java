package edu.kh.project.main.model.service;

public interface MainService {

	/** 비밀번호 초기화
	 * @param inputNo
	 * @return
	 */
	int resetPw(int inputNo);

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
