import java.util.*;
class ex8
{
	public static void main(String[] args)
	{
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; 
		int count = 0;
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");

			try {
				input = new Scanner(System.in).nextInt();
			} catch(Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. "
						+"�ٽ� ���� �Է����ּ���.");
				continue;
			}
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break; 
			}
		} while(true);
	} 
} 