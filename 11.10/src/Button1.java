import java.awt.*;
class Button2 extends Frame {
	Button btn1, btn2, btn3;
	public Button2(String str) {
		super(str);
		Panel p=new Panel();
		btn1 = new Button("����");
		btn2= new Button("����");
		btn3= new Button("��");
		p.add(btn1); p.add(btn2);p.add(btn3);
		add(p);
		btn3.setEnabled(false);
		setSize(200,200);
		setVisible(true);
	}
}
public class Button1{
	public static void main(String[] args) {
		new Button2("��ư �����");

	}
}
