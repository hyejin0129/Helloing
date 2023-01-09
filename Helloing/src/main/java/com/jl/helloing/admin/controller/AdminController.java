package com.jl.helloing.admin.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jl.helloing.admin.model.service.AdminService;
import com.jl.helloing.admin.model.vo.Chatbot;
import com.jl.helloing.common.model.vo.PageInfo;
import com.jl.helloing.common.template.Pagination;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("page.ad")
	public String adminPage() {
		return "admin/menubar_admin";
	}
	
	@RequestMapping("actPay.ad")
	public String activityPaymentViewList() {
		return "admin/activityPaymentListView";
	}
	
	@RequestMapping("businessList.ad")
	public String adminBusinessListView() {
		return "admin/adminBusinessListView";
	}
	
	@RequestMapping("boardList.ad")
	public String adminBoardListView() {
		return "admin/adminBoardListView";
	}
	
	@RequestMapping("memList.ad")
	public String adminMemberListView() {
		return "admin/adminMemberListView";
	}
	
	@RequestMapping("replyList.ad")
	public String adminReplyListView() {
		return "admin/adminReplyListView";
	}

	@RequestMapping("businessPayList.ad")
	public String businessPaymentListView() {
		return "admin/businessPaymentListView";
	}
	
	@RequestMapping("reportList.ad")
	public String reportListView() {
		return "admin/reportListView";
	}
	
	@RequestMapping("roomPay.ad")
	public String roomPaymentListView() {
		return "admin/roomPaymentListView";
	}
	
	@RequestMapping("QAList.ad")
	public String adminQAListView() {
		return "admin/adminQAListView";
	}
	
	//---------------- 챗봇 ----------------
	
	// 챗봇 등록
	@RequestMapping("insert.qa")
	public String insertChatbot(Chatbot c, Model m) {
		
		int result = adminService.insertChatbot(c);

		if(result > 0) {
			return "redirect:/chatbotList.ad";
		}else {
			m.addAttribute("alertMsg", "키워드 등록에 실패했습니다");
			return "admin/chatbotListView";
		}
	}
	
	// 챗봇 리스트 조회
	@RequestMapping("chatbotList.ad")
	public ModelAndView chatBotListView(@RequestParam(value="cpage", defaultValue="1") int currentPage
								 ,ModelAndView mv) {
		
		PageInfo pi = Pagination.getPageInfo(adminService.selectChatbotListCount(), currentPage, 10, 5);

		mv.addObject("list", adminService.selectChatbotList(pi))
		  .setViewName("admin/chatbotListView");
		
		return mv;
	}

}
