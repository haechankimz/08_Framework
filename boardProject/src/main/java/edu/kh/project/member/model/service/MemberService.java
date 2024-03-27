package edu.kh.project.member.model.service;

import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dto.Member;


public interface MemberService {

	/** 로그인 서비스
	 * @param inputMember
	 * @return loginMember
	 */
	Member login(Member inputMember);

	
}
