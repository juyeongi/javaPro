package days24;

public class Ex05 {
	public static void main(String[] args) {
		
		Button btnTouch = new Button();
		
		btnTouch.setOnClickListener(new CallListener());
		btnTouch.touch();
		
		btnTouch.setOnClickListener(new MessageListener());
		btnTouch.touch();
	}
}

class Button{
	//필드
	OnClickListener listener;
	//생성자, setter, .. 의존성주입 DI
	//						new연산자보다 결합력이 낮아 좋은코딩
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	//중첩 인터페이스
	interface OnClickListener{
		//on 이벤트처리
		void onClick(); //추상메서드
	}
}
class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 건다");
		
	}
	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지를 보낸다");
	}
	
}

