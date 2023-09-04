package ch04_pjt_exam01.ems.member.service;

import java.util.Map;

import ch04_pjt_exam01.ems.member.Member;
import ch04_pjt_exam01.ems.member.dao.MemberDAO;

public class MemberAllSelectService {
	private MemberDAO memberDao;
	
	public MemberAllSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public Map<String, Member> allSelect() {
		return memberDao.getMemberDB();
	}
}