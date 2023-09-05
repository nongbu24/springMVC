package ch04_pjt_exam01.ems.member.service;

import java.util.Map;

import ch04_pjt_exam01.ems.member.dao.MemberDAO;
import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class MemberAllSelectService {
	private MemberDAO memberDao;
	
	public MemberAllSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public Map<String, MemberDO> allSelect() {
		return memberDao.getMemberDB();
	}
	
}