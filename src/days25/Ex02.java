package days25;

public class Ex02 {
	
	enum Direction  {EAST, SOUTH, WEST, NORTH}
	
	public static void main(String[] args) {
		
		Direction d1 = Direction.EAST;
		System.out.println(d1);
		System.out.println(d1.name() );
		System.out.println(d1.ordinal() );
		
		Direction d2 = Direction.valueOf(d1.name() );
		System.out.println(d2);
		
		switch (d2) {
		case EAST:	//Direction 생략, 상수만 입력 가능
			break;
		case NORTH:
			break;
		case SOUTH:
			break;
		case WEST:
			break;
		}
	}
}
