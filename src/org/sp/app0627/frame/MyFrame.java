package org.sp.app0627.frame;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

//나와는 다른위치에 있는 클래스의 위치를 명시할 때는 임포트를 사용함 컨트롤+쉬프트+O
//import java.awt.Frame;

public class MyFrame {
	
	public static void main(String[] args) {
		//GUI프로그래밍을 위해서는 그 바탕이 되는 컨테이너가 필요한데,
		//최상위 컨테이너는 모든 프로그래밍 언어에서 Window임
		//특히 자바에서는 윈도우를 표현하는 클래스로 Frame이라는 클래스를 지원함
		String str; //java.lang 패키지에 들어있기 때문에 선언하지 않아도 컴파일 에러가 안남
		
		//1)
		//일반클래스 - new
		//추상클래스 - 자식 정의 후 new
		//인터페이스 - 자식 정의 후 new
		Frame f=new Frame(); //컨트롤+쉬프트+O 자동으로 임포트 해줌
		f.setSize(300, 400); //너비, 높이 지정, setSize(int width, int height)
		f.setVisible(true); //윈도우창 화면에 보이게 함, setVisible(boolean b), true: 보이게 false:안보이게
		
		//4)
		//프레임에 부착될 여러 컴포넌트들에 대해 개발자가 원하는 레이아웃을 명시하지 않으면
		//디폴트 레이아웃이 적용되어 모든 컴포넌트가 윈도우크기만해지므로,
		//일단 레이아웃 수업에 앞서 이부분만 방지하기 위한 FlowLayout을 적용해보자
		FlowLayout flow=new FlowLayout();
		//생성된 레이아웃을 윈도우인 프레임에 적
		f.setLayout(flow);
		
		//2)
		//TextField 쉬프트 f2하면 바로 공식문서로
		TextField t1=new TextField("여기에 뭔가 넣을거임");
		//html에서 부모요소에 appendChild하듯 자바도 마찬가지로
		//바깥쪽 컨테이너인 프레임에 각종 컴포넌트들을 붙여보자
		f.add(t1);
		
		//3)
		//버튼을 생성해서 윈도우 프레임에 부착하기
		Button bt=new Button("나버튼");
		f.add(bt);
		
		//5)
		//체크박스 부착하기
		Checkbox ch1=new Checkbox("music");
		Checkbox ch2=new Checkbox("book");
		Checkbox ch3=new Checkbox("programing");
		Checkbox ch4=new Checkbox("movie");
		
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.add(ch4);
		
		//6)
		//TextArea 부착하기
		TextArea area= new TextArea(10, 15);
		f.add(area);
		
		//7)
		//Choice 부착하기 (자바 셀렉트박스임)
		Choice c=new Choice(); //셀렉트박스
		c.add("choisa0903@naver.com");
		c.add("choisa0903@daum.com");
		c.add("choisa0903@gmail.com");
		
		f.add(c);
	}
}
