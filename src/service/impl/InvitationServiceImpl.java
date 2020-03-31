package service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MybatisUtils;
import dao.InvitationMapper;
import pojo.Invitation;
import service.InvitationService;

public class InvitationServiceImpl implements InvitationService {

	private InvitationMapper mapper;
	private SqlSession SqlSession;
	
	@Override
	public List<Invitation> getInvList() {
		SqlSession =MybatisUtils.createSqlSession();
		List<Invitation> list=SqlSession.getMapper(InvitationMapper.class).getInvList();
		return list;
	}

}
