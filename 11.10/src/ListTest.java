import java.awt.*;
class ListTest1 extends Frame{
	Panel p;
	List list;
	public ListTest1(String str) {
		super(str);
		p=new Panel();
		list=new List(2,true);
		list.add("�̴�");
		list.add("����");
		list.add("����");
		list.add("����");
		p.add(list);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
}

public class ListTest {

	public static void main(String[] args) {
		new ListTest1("��Ƽ ���� ����Ʈ");
	}

}
