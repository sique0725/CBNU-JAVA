import java.awt.* ;
class ChoiceTest1 extends Frame 
{
	Choice ch;
	public ChoiceTest1(String str)
	{
		super(str);
		ch= new Choice();
		ch.addItem("이대");
		ch.addItem("강남");
		ch.addItem("종로");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}

public class ChoiceTest
{
	public static void main(String[] args) 
	{
		new ChoiceTest1("콤보 박스 연습");
	}
}
