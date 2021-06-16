package co.food.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		// 프레임 생성
        JFrame frm = new JFrame("＊ 。BLUE BIRD 。＊");
 
        Container contentPane = getContentPane();     
        //contentPane.setLayout(new BorderLayout(30, 20));
        contentPane.setBackground(new Color(181, 171, 234));
        // 프레임 크기 설정
        frm.setSize(350, 300);
        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null); 
        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 레이아웃 설정
        frm.getContentPane().setLayout(null);
        // 버튼 생성
        JButton btn1 = new JButton("LOGIN");
        JButton btn2 = new JButton("LOGOUT");
        // ★ 버튼 위치와 크기 설정
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        // 프레임이 보이도록 설정
        frm.setVisible(true);
	}

		public void BorderLayoutEx() {
			setTitle("FlowLayout 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentPane = getContentPane();

			contentPane.setLayout(new BorderLayout(30, 20));
			contentPane.setBackground(new Color(181, 171, 234));


			contentPane.add(new JButton("전체조회"));
			contentPane.add(new JButton("등록"));
			contentPane.add(new JButton("수정"));
			contentPane.add(new JButton("삭제"));
			contentPane.add(new JButton("재료조회"));
			contentPane.add(new JButton("수량관리"));
			contentPane.add(new JButton("전직원리스트"));
			contentPane.add(new JButton("회원탈퇴"));
			contentPane.add(new JButton("로그아웃"));
			contentPane.add(new JButton("종료"));

			setSize(300, 200);
			setVisible(true);
		}
	public static void main(String[] args) {
		//new BorderLayoutEx();
		new MyFrame();
	}
}
