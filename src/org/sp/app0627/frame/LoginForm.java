package org.sp.app0627.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class LoginForm {
	public static void main(String[] args) {
		Frame f = new Frame("로그인 폼");
		// 프레임의 디폴트 레이아웃은 보더레이아웃이므로 변경이 필요하면 직접 변경해줘야함
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 레이아웃 적용

		Label la_id = new Label("ID");
		Label la_pass = new Label("PASSWORD");

		TextField t_id = new TextField();
		TextField t_pass = new TextField();

		Button bt_login = new Button("Log-in");
		Button bt_regist = new Button("Join");

		// 부착하기 전에 속성을 적용해 놓자
		// Color c;
		// la_id.setBackground(Color.YELLOW);
		Dimension d = new Dimension(130, 30); // 크기 객체
		// id 라인 객체들에 크기를 설정함
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		// password 라인 객체들에 크기를 설정함
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		// 컴포넌트들을 프레임에 부착하기
		f.add(la_id);
		f.add(t_id);
		f.add(la_pass);
		f.add(t_pass);
		f.add(bt_login);
		f.add(bt_regist);

		f.setSize(300, 145);
		f.setVisible(true);

	}

}
