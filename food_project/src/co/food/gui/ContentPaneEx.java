package co.food.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	 public ContentPaneEx() {
	        setTitle("ContentPane과 JFrame 예제"); //프레임 타이틀
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
	        contentPane.setBackground(new Color(181,171,234)); 
	        contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
	        
	        //contentPane.add(new JButton("")); 
	        contentPane.add(new JButton("전체조회")); 
	        contentPane.add(new JButton("등록"));
	       //setBounds(30,170 ,122,30); 
	        
	        setSize(300, 150); // 프레임 크기 300 x 150
	        setVisible(true); // 화면에 프레임 출력
	        
	    }
	 public static void main(String[] args) {
	        new ContentPaneEx();
	 
	    }
}
