package com.jl.helloing.member.model.vo;

import lombok.Data;

@Data
public class Planner {
	private int plannerNo; // 플래너번호
	private String plannerName; // 플래너이름
	private int startDate; // 시작날짜
	private int endDate; // 종료날짜
}
