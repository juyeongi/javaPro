package days24;

// DTO, DAO,VO ...
// - VO = value object 
//				값 읽기/쓰기 객체
public class MemberVO {
	//팀원 직위, 이름 읽어오는 클래스 
	
	private String name;
	private String position;	//팀장, 팀원
	
	public MemberVO(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public MemberVO() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", position=" + position + "]";
	}
		
	

}
