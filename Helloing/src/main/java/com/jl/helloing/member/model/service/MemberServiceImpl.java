package com.jl.helloing.member.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jl.helloing.member.model.dao.MemberDao;
import com.jl.helloing.member.model.vo.AccommWish;
import com.jl.helloing.member.model.vo.ActivityWish;
import com.jl.helloing.member.model.vo.Book;
import com.jl.helloing.member.model.vo.Expense;
import com.jl.helloing.member.model.vo.Member;
import com.jl.helloing.member.model.vo.Plan;
import com.jl.helloing.member.model.vo.Planner;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 로그인
	@Override
	public Member loginMember(Member m) {
		return memberDao.loginMember(m, sqlSession);
	}
	
	// 회원가입
	@Override
	public int insertMember(Member m) {
		return memberDao.insertMember(m, sqlSession);
	}

	
	
	
	
	
	//혜진
	
	@Override
	public ArrayList<Book> selectScheduled(int memNo) {
		return null;
	}

	@Override
	public ArrayList<Book> selectLast(int memNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> selectCancelled(int memNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book reservationDetail(int memNo, int orderNo) {
		// TODO Auto-generated method stub
		return null;
	}

	//비밀번호 체크
	@Override
	public String checkPwd(Member m) {
		return memberDao.checkPwd(m, sqlSession);
	}
	
	//비밀번호 변경
	@Override
	public int memberUpdatePwd(Member m) {
		return memberDao.memberUpdatePwd(m, sqlSession);
	}

	//회원 정보 수정
	@Override
	public int memberUpdate(Member m) {
		return memberDao.memberUpdate(m, sqlSession);
	}

	//찜한 숙소 리스트 조회
	@Override
	public ArrayList<AccommWish> wishAccommList(int memNo) {
		return memberDao.wishAccommList(memNo, sqlSession);
	}

	//찜한 숙소 삭제
	@Override
	public int deleteWishAccomm(AccommWish aw) {
		return memberDao.deleteWishAccomm(aw, sqlSession);
	}

	//찜한 액티비티
	@Override
	public ArrayList<ActivityWish> wishActivityList(int memNo) {
		return memberDao.wishActivityList(memNo, sqlSession);
	}
	//찜한 액티비티 삭제
	@Override
	public int deleteWishActivity(ActivityWish aw) {
		return memberDao.deleteWishActivity(aw, sqlSession);
	}
	
	//플래너 리스트 조회
	@Override
	public ArrayList<Planner> plannerList(int memNo) {
		return memberDao.plannerList(memNo, sqlSession);
	}

	//플래너 생성
	@Override
	public int insertPlanner(Planner pl) {
		return memberDao.insertPlanner(pl, sqlSession);
	}
	
	//플래너 멤버 추가
	@Override
	public int insertPlannerMem(int memNo) {
		return memberDao.insertPlannerMem(memNo, sqlSession);
	}
	
	//플래너 수정
	@Override
	public int updatePlanner(Planner pl) {
		// TODO Auto-generated method stub
		return 0;
	}

	//플래너 삭제
	@Override
	public int deletePlanner(Planner pl) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Plan planDetailView(int memNo, int planNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense expenseView(int planNo) {
		// TODO Auto-generated method stub
		return null;
	}







}
