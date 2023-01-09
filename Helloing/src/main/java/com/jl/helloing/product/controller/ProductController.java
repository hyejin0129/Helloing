package com.jl.helloing.product.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jl.helloing.member.model.vo.Member;

@Controller
public class ProductController {

	// 숙소 메인
	@RequestMapping("accomm")
	public String accommMain() {
		return "product/accommMain";
	}
	
	// 숙소 검색
	@RequestMapping("search.accomm")
	public String searchAccomm() {
		return "product/accommSearch";
	}
	
	// 숙소 상세 페이지
	@RequestMapping("detail.accomm")
	public String DetailAccomm() {
		return "product/accommDetail";
	}
	
	// 숙소 예약(결제) 페이지
	@RequestMapping("reserve.accomm")
	public String reserveAccomm() {
		return "product/accommReserve";
	}
	
	// 숙소 결제 완료
	@RequestMapping("pay.accomm")
	public String payAccomm() {
		return "product/paySuccess";
	}
	
	// 액티비티 메인
	@RequestMapping("activity")
	public String activityMain() {
		return "product/activityMain";
	}
	
	// 액티비티 검색
	@RequestMapping("search.activity")
	public String searchActivity() {
		return "product/activitySearch";
	}
	
	// 액티비티 상세 페이지
	@RequestMapping("detail.activity")
	public String DetailActivity() {
		return "product/activityDetail";
	}
	
	// 액티비티 결제 페이지
	@RequestMapping("reserve.activity")
	public String reserveActivity(HttpSession session, String ticketName0, String count0) {
		
		System.out.println("ticketName : " + ticketName0);
		System.out.println("count : " + count0);
		
		Member loginUser = (Member)session.getAttribute("loginUser");
		if(loginUser != null) {
			int memNo = loginUser.getMemNo();
			return "product/activityReserve";
		} else { // 로그인이 되어있지 않을 경우 로그인 폼으로 이동
			session.setAttribute("alertMsg", "로그인이 필요한 서비스입니다.");
			return "redirect:loginForm.me";
		}
	}
	
	// 액티비티 결제 완료
	@RequestMapping("pay.ticket")
	public String payActivity() {
		return "product/paySuccess";
	}
}

