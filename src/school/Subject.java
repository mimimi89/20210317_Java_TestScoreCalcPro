package school;

import java.util.ArrayList;
import utils.Define;


public class Subject {
	private String subjectName;	//과목명
	private int subectId;	//과목 고유 번호
	private int gradeType;	//학점 평가 정책
	
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public Subject(String subjectName, int subectId) {
		super();
		this.subjectName = subjectName;
		this.subectId = subectId;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubectId() {
		return subectId;
	}

	public void setSubectId(int subectId) {
		this.subectId = subectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}	//수강신청 메서드
	
	
	

}
