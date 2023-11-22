package days25;

public class Ex03 {
	//				 			0			1			2		3		순서
//	enum Direction  {EAST, SOUTH, WEST, NORTH}
//	enum Direction  {EAST=100	, SOUTH=2==, WEST, NORTH}
     //		ㄴ문법에러
	
	//The constructor Ex03.Direction(int) is undefined
	enum Direction  {
		EAST(100,	"▶"), SOUTH(200,"▼"), WEST(300,"◀"), NORTH(400,"▲");
	
		private final int value;
		private final String symbol;
		/*
		Direction(int value){
		 this.value= value;
		}
		*/
		Direction(int value, String symbol){
			this.value = value;
			this.symbol =symbol;
		}

		public String getSymbol() {
			return symbol;
		}

		public int getValue() {
			return value;
		}
		
	}
	
	public static void main(String[] args) {
		
//		[ 열거형에 멤버 ( 필드 , 메서드 , 생성자  )추가 ]
		/*
		 * 1.enum Direction  {EAST, SOUTH, WEST, NORTH}
		 * 2.컴파일러가 클래스 변환
		 * 		class Direction extends Enum{
		 * 			static final EAST = new Direction ("East");
		 * 			static final SOUTH = new Direction ("SOUTH");
		 * 			static final WEST = new Direction ("WEST");
		 * 			static final NORTH = new Direction ("NORTH");
		 * 
		 * 			private String name;
		 * 			public int namename(){
		 * 				return this.name;
		 * 			}
		 * 			private int ordinal;
		 * 			public int ordinal(){
		 * 				return this.ordinal;
		 * 			}		
		 * 			private Direction(String name){
		 * 			this.name =name;
		 * 			}
		 * 
		 * 열거형 ordinal()	 메서드에 의해서 열거형 상수를 사용하는데
		 * 상수값은 0,1,2, .. 반환
		 * 내가 원하는 정수값을 설정해서 사용할 수 없음
		 * 
		 * 
		 */
		
		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(dir.name()+"/"+dir.ordinal()+"/"+ dir.getSymbol()+"/"+dir.getValue());
		}
	}
}
