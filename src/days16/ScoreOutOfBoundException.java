package days16;

//unchecked 예외 
//0~100점이 아닐 때 사용자가 정의한 예외 발생시키기 위한 클래스  

public class ScoreOutOfBoundException extends RuntimeException{
	//예외 코드번호 필드
	
	private final int ERROR_CODE;
	//상수이기떄문에 setter x 
	//final은 한번만 초기화되기 때문

	public int getERROR_CODE() {
		return ERROR_CODE;
	}
	public ScoreOutOfBoundException(String message) {
		this(1000, message);
	}
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		ERROR_CODE = eRROR_CODE;
	}

}
