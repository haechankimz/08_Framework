package edu.kh.project.myPage.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.mapper.MyPageMapper;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MyPageServiceImpl implements MyPageService{

	private final MyPageMapper mapper;
	
	private final BCryptPasswordEncoder bcrypt;
	
	// @RequiredArgsConstructor 를 이용했을 때 자동 완성 되는 구문
//		@Autowired
//		public MyPageServiceImpl(MyPageMapper mapper) {
//			this.mapper = mapper;
//		}
	
	@Override
	public int updateInfo(Member inputMember, String[] memberAddress) {
		
		// 입력된 주소가 있을 경우
		// a^^^b^^^c 형태로 가공
		
		
		// 주소 입력 x -> inputMember.getMemberAddress() -> ",,"
		if(inputMember.getMemberAddress().equals(",,")) {
			
			// 주소에 null 대입
			inputMember.setMemberAddress(null);
		}else { 
			//memberAddress를 A^^^B^^^C 형태로 가공
			String address = String.join("^^^", memberAddress);
			
			// 주소에 가공된 데이터 대입
			inputMember.setMemberAddress(address);
		}

		// SQL 수행 후 결과 반환
		return mapper.updateInfo(inputMember);
	}
	
	
	// 비밀번호 수정
	@Override
	public int changePw(String currentPw, String newPw, int memberNo) {

		String result = mapper.selectPw(memberNo);
		
		// 입력받은 현재 비밀번호와 DB에서 조회한 비밀번호 비교
		if(!bcrypt.matches(currentPw, result)) {
			return 0;
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("memberNo", memberNo);
		map.put("newPw", bcrypt.encode(newPw));
		
		return mapper.changePw(map);
	}
	
	
	
	
	
	
	
	
	
	
	
}
