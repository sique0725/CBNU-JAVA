class Student {
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "�豸";
}

class Instancevariable {
	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.m_nEng = 40;
		obj.m_nMat = 50;
		System.out.println("obj�� �������� = " + obj.m_nKor);
		System.out.println("obj�� �������� = " + obj.m_nMat);
		System.out.println("obj�� �������� = " + obj.m_nEng);
		System.out.println("Student�� ������= " + Student.g_strTeacher);
		System.out.println("obj�� ������= " + obj.g_strTeacher);
		Student.g_strTeacher = "���߱�";
		System.out.println("obj�� ������= " + obj.g_strTeacher);
	}
}
