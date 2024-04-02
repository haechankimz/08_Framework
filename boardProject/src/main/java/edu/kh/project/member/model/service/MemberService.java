package edu.kh.project.member.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dto.Member;


public interface MemberService {

	/** 로그인 서비스
	 * @param inputMember
	 * @return loginMember
	 */
	Member login(Member inputMember);

	/** 회원가입 서비스
	 * @param inputMember
	 * @param memberAddress
	 * @return
	 */
	int signup(Member inputMember, String[] memberAddress);

	/** 이메일 중복 검사
	 * @param memberEmail
	 * @return count
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복 검사
	 * @param memberNickname
	 * @return count
	 */
	int checkNickname(String memberNickname);

	/** 빠른 로그인
	 * @param memberEmail
	 * @return
	 */
	Member quickLogin(String memberEmail);

	
	/** 목록 조회
	 * @return memberList
	 */
	List<Member> selectMember();
	

	

	
}