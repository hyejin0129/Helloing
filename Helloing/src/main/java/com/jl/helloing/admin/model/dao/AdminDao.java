package com.jl.helloing.admin.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.jl.helloing.admin.model.vo.Chatbot;
import com.jl.helloing.common.model.vo.PageInfo;

@Repository
public class AdminDao {
	
	public int selectChatbotQ(SqlSessionTemplate sqlSession, Chatbot c) {
		return sqlSession.selectOne("adminMapper.selectChatbotQ", c);
	}
	
	public int insertChatbot(SqlSessionTemplate sqlSession, Chatbot c) {
		return sqlSession.insert("adminMapper.insertChatbot", c);
	}
	
	public int selecChatbottListCount(SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("adminMapper.selecChatbottListCount");
	}
	
	public ArrayList<Chatbot> selectChatbotList(SqlSessionTemplate sqlSession, PageInfo pi){
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("adminMapper.selectChatbotList", null, rowBounds);
	}
	
	public Chatbot chatbotUpdateForm(SqlSessionTemplate sqlSession, String originChatbotQ) {
		return sqlSession.selectOne("adminMapper.chatbotUpdateForm", originChatbotQ);
	}
	
	public int selectChatbotQUpdate(SqlSessionTemplate sqlSession, Chatbot c) {
		return sqlSession.selectOne("adminMapper.selectChatbotQUpdate", c);
	}
	
	public int updateChatbot(SqlSessionTemplate sqlSession, Chatbot c) {
		return sqlSession.update("adminMapper.updateChatbot", c);
	}
	
	public int deleteChatbot(SqlSessionTemplate sqlSession, String chatbotQ) {
		return sqlSession.delete("adminMapper.deleteChatbot", chatbotQ);
	}
	
	public int selectSearchChatbotCount(SqlSessionTemplate sqlSession, HashMap<String, String> map) {
		return sqlSession.selectOne("adminMapper.selectSearchChatbotCount", map);
	}
	
	public ArrayList<Chatbot> searchChatbot(SqlSessionTemplate sqlSession, PageInfo pi, HashMap<String, String> map){
		
		int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("adminMapper.searchChatbot", map, rowBounds);
	}
	
	public String selectChatbotA(SqlSessionTemplate sqlSession, HashMap map) {
		return sqlSession.selectOne("adminMapper.selectChatbotA", map);
	}

}
