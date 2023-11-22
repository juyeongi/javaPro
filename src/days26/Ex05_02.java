package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05_02 {
	public static void main(String[] args) throws IOException {
		int [] score ={
					1, 100, 99, 98,	//한 학생의 메모리크기 4byte*4
					2, 78, 92, 68,
					3, 60, 59, 68,
					4, 43, 65, 73,
					5, 100, 100, 98
						};
		//성적정보
		String name = ".\\src\\days26\\score.dat";
		String mode = "rw";
		
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			for (int i = 0; i < score.length; i++) {
				long fp= raf.getFilePointer();
				System.out.printf(">현재 파일포인터 : %d - [%d]\n",fp,score[i]);
				raf.writeInt(score[i]);
			} //	for
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//일시정지 . Enter 입력시 진행
		System.out.println(">Enter입력시 진행");
		System.in.read();
		System.in.skip(System.in.available()); //13,10제거
		//>현재 파일포인터 : 0 - [1]
		//>현재 파일포인터 : 4 - [100]
		//raf.writeInt(score[i]);  > int(4byte)로 입력해서 포인터 4씩 증가 
		//System.out.printf(" 번호:%d, 국어: %d 영어: %d 수학: %d 총점 : %d 평균 : %.2f ", no, kor, eng, mat, total, avg);
		int no,kor,eng,mat;
		int tot;
		double avg;
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){

			int 학생수 = score.length/4; 	//5
			for (int i = 0; i <학생수; i++) {
				//현제 fp 0위치
				no=raf.readInt();
				kor=raf.readInt();
				eng=raf.readInt();
				mat=raf.readInt();
				tot =kor+eng+mat;
				avg=(double)tot/3;
				System.out.printf(" 번호:%d, 국어: %d 영어: %d 수학: %d 총점 : %d 평균 : %.2f\n "
						, no, kor, eng, mat, tot, avg);

			} //	for
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//[문제]
		//3번학생의 수학점수 (68 >20) 수정
		//randomacc > seek > 
		
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			long pos = (4*4)*2 + 4+4+4; //3번의 수학점수 위치 44
			raf.seek(pos);
			raf.writeInt(20);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//[문제]
		//3번학생의 정보만 출력
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			long pos = (4*4)*2;
			raf.seek(pos);
			no=raf.readInt();
			kor=raf.readInt();
			eng=raf.readInt();
			mat=raf.readInt();
			tot =kor+eng+mat;
			avg=(double)tot/3;
			System.out.printf(" 번호:%d, 국어: %d 영어: %d 수학: %d 총점 : %d 평균 : %.2f\n "
					, no, kor, eng, mat, tot, avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}//main
}//class
