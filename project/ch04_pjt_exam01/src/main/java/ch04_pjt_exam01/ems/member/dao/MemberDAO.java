package ch04_pjt_exam01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {
	private Map<String, MemberDO> memberDB = new HashMap<String, MemberDO>();
	
	public void insert(MemberDO memberDo) {
		memberDB.put(memberDo.getId(), memberDo);
	}
	
	public MemberDO select(String Id) {
		return memberDB.get(Id);
	}
	
	public void update(MemberDO memberDo) {
		memberDB.put(memberDo.getId(), memberDo);
	}
	
	public void delete(String id) {
		memberDB.remove(id);
	}
	
	public Map<String, MemberDO> getMemberDB() {
		return memberDB;
	}
	
}