package org.sp.app0627.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//자바에서 지원하는 GUI컴포넌트들을 개발자가 원하는 위치에 배치하려면,
//배치관리자를 이용해야 함
//만약 개발자가 아무런 배치관리자를 적용하지 않으면 디폴트 배치관리자가 적용됨
//자바에서의 배치방법은 총 5가지
/*
 1) FlowLayout ★★★
 남은 공간으로 컴포넌트들이 흘러다닌다고 하여 Flow배치라고 함
 이 때 흐르는 방향은 수평 및 수직
 
 2) BorderLayout ★★★
 동(EAST),서(WEST),남(SOUTH),북(NORTH),센터(CENTER)의 배치를 갖는 레이아웃
 *특징: 각 방위에 붙는 컴포넌트들은 각 방위 공간을 가득 채워버림. 
 *그래서 해당 방위에 뭔가를 붙이지 않으면, 정의하지 않으면 다른 방위가 그 공간을 채움
ex) html_block처럼 빈 공간을 채워버림
 
 3) GridLayout ★★★
 4) FrameLayout
 5) GridbagLayout
*/
//프레임은 디폴트 배치관리자로 BorderLayout이 적용됨
public class LayoutTest {
	public static void main(String[] args) {
		Button bt_north=new Button("North");
		Button bt_south=new Button("South");
		Button bt_east=new Button("East");
		Button bt_west=new Button("West");
		Button bt_center=new Button("Center");
		
		//프레임은 디폴트 배치관리자로 BorderLayout이 적용됨
		Frame f=new Frame("BorderLayout 학습");
		BorderLayout br=new BorderLayout();
		f.setLayout(br); //윈도우에 배치 적용
		
		f.add(bt_north, BorderLayout.NORTH);
		f.add(bt_south, BorderLayout.SOUTH);
		f.add(bt_east, BorderLayout.EAST);
		f.add(bt_west, BorderLayout.WEST);
		f.add(bt_center, BorderLayout.CENTER);
		
		//윈도우창 크기 및 보이게 설정
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
