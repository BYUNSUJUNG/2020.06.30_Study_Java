package Ch25;

import java.io.*;

public class C06CharStreamEx {
	public static void main(String[] args) {
		try {

			Writer out = new FileWriter("c:/temp/test2.txt");
			char[] array = {'A', 'B', 'C', 'D', 'E'};
			
			out.write(array);
			
			// 내용을 뒤이어서 추가하고 싶을 경우
			out.append('F');
			out.flush();
			out.close();
			
			Reader in = new FileReader("c:/temp/test2.txt");
			int num;
			char[] buffer = new char[4096];
			//while(true) {
				num = in.read(buffer,0,3);
				//if(num==-1) break;
				for (int i = 0; i < num; i++) {
					System.out.println(buffer[i]);	
				}
			//}
		} catch(Exception e) {
			
		}
		
	}
}
