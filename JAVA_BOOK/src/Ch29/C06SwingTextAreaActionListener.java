package Ch29;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C06SwingTextAreaActionListener extends JFrame implements ActionListener{
	JTextArea Area1;
	JTextField txt1;
	JButton btn;
	JScrollPane scollPane;
	public C06SwingTextAreaActionListener()
	{
		super("다섯번째 프레임창입니다");	//프레임 생성자 호출
		JPanel Pl = new JPanel();	//패널 객체 생성
		
		Area1 = new JTextArea(10,10);	//TextArea객체 생성
		//Area1.setBounds(10,10,310,310);			//TextArea위치 지정
		
		scollPane=new JScrollPane(Area1);
		scollPane.setBounds(10,10,450,150);
		
		txt1 = new JTextField();
		txt1.setBounds(10,340,100,20);

		btn=new JButton("INSERT");
		btn.setBounds(10,370,100,20);
		
		
		//Pl.add(Area1);		//패널에 Area1 추가
		Pl.add(scollPane);	//스크롤 Pane 추가 
		Pl.add(txt1);		//패널에 txt1 추가
		Pl.add(btn);
		Pl.setLayout(null);	//레이아웃 없음 설정
		add(Pl);		//프레임에 패널 전달

		setSize(500,500);	//패널사이즈(==프레임사이즈) 지정
		setVisible(true);	//화면 표시 여부
	}
	public static void main(String[] args) {
		new C06SwingTextAreaActionListener();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txt1)
		{
			Area1.append(txt1.getText()+"\n");
			txt1.setText("");
		}
		if(e.getSource()==btn)
		{
			Area1.append("버튼입력\n");
		}
		
	}

}