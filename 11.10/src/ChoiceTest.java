import java.awt.* ;
class ChoiceTest1 extends Frame 
{
	Choice ch;
	public ChoiceTest1(String str)
	{
		super(str);
		ch= new Choice();
		ch.addItem("�̴�");
		ch.addItem("����");
		ch.addItem("����");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}

public class ChoiceTest
{
	public static void main(String[] args) 
	{
		new ChoiceTest1("�޺� �ڽ� ����");
	}
}
