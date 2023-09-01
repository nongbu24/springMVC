package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentModifyService {	//학생 개체를 바꾸는 객체
	private StudentDAO studentDao;
	
	public StudentModifyService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void modify(Student student) {
		if(verify(student.getsNum())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is unavailable");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}
