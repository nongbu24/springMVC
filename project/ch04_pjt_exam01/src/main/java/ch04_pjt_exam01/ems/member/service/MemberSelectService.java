package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.dao.MemberDAO;
import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class MemberSelectService {
	private MemberDAO memberDao;
	
	public MemberSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public MemberDO select(String id) {
		if(verify(id)) {
			return memberDao.select(id);
		} else {
			System.out.println("Member information is available.");
			return null;
		}
	}
	
	public boolean verify(String id) {
		MemberDO memberDo = memberDao.select(id);
		return memberDo != null ? true : false;
	}
	
}