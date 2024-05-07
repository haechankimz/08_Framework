package edu.kh.project.common.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/* Spring Scheduler : 
 *  �뒪�봽留곸뿉�꽌 �젣怨듯븯�뒗 �씪�젙 �떆媛�/二쇨린 留덈떎 �삁�젙�맂 肄붾뱶瑜� �떎�뻾�븯�뒗 媛앹껜
 * 
 * [�꽕�젙 諛⑸쾿]
 * 1. �봽濡쒖젥�듃紐꾿pplication.java �뙆�씪�뿉
 *    @EnableSchduling �뼱�끂�뀒�씠�뀡 異붽�
 * 
 * 2. �뒪耳�伊대윭 肄붾뱶瑜� �옉�꽦�븷 蹂꾨룄 �겢�옒�뒪瑜� �깮�꽦�븳 �썑 Bean�쑝濡� �벑濡�
 *    -> @Component �뼱�끂�뀒�씠�뀡 �옉�꽦
 *    
 * 3. �빐�떦 �겢�옒�뒪�뿉 @Scheduled(�떆媛�/二쇨린) �뼱�끂�뀒�씠�뀡�쓣 異붽��븳 硫붿꽌�뱶 �옉�꽦
 *   
 *    * 二쇱쓽�궗�빆 *
 *    - �빐�떦 硫붿꽌�뱶�뒗 諛섑솚�삎�씠 議댁옱�빐�꽌�뒗 �븞�맂�떎!! == void
 * */

@Component // bean �벑濡� -> �뒪�봽留곸씠 �옄�룞�쑝濡� �뒪耳�伊대쭅 肄붾뱶瑜� �닔�뻾�븯寃� �븿
@Slf4j
public class TestScheduling {

	
	// @Scheduled() 留ㅺ컻 蹂��닔
	
	// 1) fixedDelay : 
	//	 - �씠�쟾 �옉�뾽�씠 �걹�궃 �썑 �떎�쓬 �옉�뾽�씠 �떆�옉 �븷 �븣 源뚯��쓽 �떆媛꾩쓣 吏��젙
	
	
	// 2) fixedRate  : 
	//   - �씠�쟾 �옉�뾽�씠 �떆�옉�븳 �썑 �떎�쓬 �옉�뾽�씠 �떆�옉 �븷 �븣 源뚯��쓽 �떆媛꾩쓣 吏��젙
	
	
	// 3) cron
	//   - UNIX 怨꾩뿴 �옟 �뒪耳�伊대윭 �몴�쁽�떇
	
	//   - cron="珥� 遺� �떆 �씪 �썡 �슂�씪 [�뀈�룄]"   (�씪�슂�씪 1 ~ �넗�슂�씪 7)
		
	//	 ex) [2024�뀈] �솕�슂�씪 5�썡 7�씪 12�떆 50遺� 0珥덉뿉 �닔�뻾
	//		cron="0 50 12 7 5 3 2024"
	
	//   - �듅�닔臾몄옄 蹂� �쓽誘�
	// * : 紐⑤뱺 �닔
	// - : �몢 �닔 �궗�씠�쓽 媛�. ex) 10-15 => 10 �씠�긽 15 �씠�븯
	// , : �듅�젙 媛� 吏��젙.    ex) 遺� �옄由ъ뿉 3,6,9,12 => 3遺�,6遺�,9遺�,12遺꾩뿉 �룞�옉
	// / : 媛� 利앷�.			ex) 0/5 => 0遺��꽣 �떆�옉�빐�꽌 5�뵫 利앷��븷 �븣 留덈떎 �닔�뻾
	
	// ? : �듅蹂꾪븳 媛� �뾾�쓬 (�썡/�슂�씪留� 媛��뒫)
	// L : 留덉�留� (�썡/�슂�씪留� 媛��뒫)
	
	
//	@Scheduled(fixedDelay = 5000) // ms �떒�쐞
//	@Scheduled(fixedRate = 5000) // ms �떒�쐞
	
	//         cron = "珥� 遺� �떆 �씪 �썡 �슂�씪 [�뀈�룄]"
//	@Scheduled(cron = "0 * * * * *") // 留� 0珥덈쭏�떎 �닔�뻾 (1遺� 留덈떎)
//	@Scheduled(cron = "0/10 * * * * *") // 0遺��꽣 10珥덈쭏�떎 �닔�뻾
//	@Scheduled(cron = "0 0 0 * * *") // 留ㅼ씪 �옄�젙留덈떎 �닔�뻾
//	@Scheduled(cron = "59 59 23 * * *") // �떎�쓬 �궇 �릺湲� 1珥� �쟾
	public void testMethod() {
		log.info("�뒪耳�伊대윭 �뀒�뒪�듃 以�...");
	}
	
}




