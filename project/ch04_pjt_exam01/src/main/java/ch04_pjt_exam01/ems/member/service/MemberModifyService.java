package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.dao.MemberDAO;
import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class MemberModifyService {
	private MemberDAO memberDao;
	
	public MemberModifyService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void modify(MemberDO memberDo) {
		if(verify(memberDo.getId())) {
			memberDao.update(memberDo);
		} else {
			System.out.println("Member information is unavailable");
		}
	}
	
	public boolean verify(String id) {
		MemberDO memberDo = memberDao.select(id);
		return memberDo != null ? true : false;
	}
	
}