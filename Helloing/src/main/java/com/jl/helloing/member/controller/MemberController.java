package com.jl.helloing.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	//승준
	//로그인
	@RequestMapping("login.me")
	public String loginMember() {
		return "member/login";
	}
	//아이디찾기
	@RequestMapping("findIdForm.me")
	public String findId() {
		return "member/findIdForm";
	}
	@RequestMapping("findPwdForm.me")
	public String findPwd() {
		return "member/findPwdForm";
	}
	@RequestMapping("newFindPwd.me")
	public String updatePwd() {
		return "member/newFindPwd";
	}
	@RequestMapping("terms.me")
	public String terms() {
		return "member/terms";
	}
	
	//혜진
	//마이페이지 메인
	@RequestMapping("myPage.hj")
	public String myPage() {
		return "member/scheduledReservation";
	}
	
	//예정된 예약
	@RequestMapping("scheduled.hj")
	public String scheduled() {
		return "member/scheduledReservation";
	}
	
	//지난 예약
	@RequestMapping("last.hj")
	public String last() {
		return "member/lastReservation";
	}
	
	//취소된 예약
	@RequestMapping("cancelled.hj")
	public String cancelled() {
		return "member/cancelledReservation";
	}
	
	//예약 상세 조회
	@RequestMapping("reservationDetail.hj")
	public String reservationDetail() {
		return "member/reservationDetail";
	}
}
