import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Company {
	public static void main(String args[]) {
		String result = ""; 
		Employee obj = null;
		String empNo = null; 
		String name = null;
		String part = null; 
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� :");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ :");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 :");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		if (position.equals("1")) { 
			obj = new Employee(empNo, name, part);
			result += obj.resultStr();
		} else {
			position = (position.equals("2")) ? "�븮" : "����";
			obj = new Manager(empNo, name, part, position);
			result += obj.resultStr();
		}

		System.out.println(result);
	}
}

