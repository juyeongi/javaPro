package days14;
//days14.Ex06 
//단독으로 사용될 때의 this : 매개변수
public class MyApp{
	//디폴트생성자
	public MyApp() {
		app_init();
	}

	private void app_init() {
		System.out.println(">MyApp 디폴트생성자 호출-필드초기화 app_init() 호출");

	}
}//class
