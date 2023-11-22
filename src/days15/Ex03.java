package days15;

import days13.Tv;

public class Ex03 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel =11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCaption("Hell World~");
		ctv.caption = true;
		ctv.dispCaption("Hi");
		
	}//main
}//class

// [자막+ 기존 Tv클래스]

class CaptionTv extends Tv{
	boolean caption; // 자막기능 on(true)/off(false)
	
	void dispCaption(String text) {
		if (this.caption) {
			System.out.println(text);
		}//if
	}
}