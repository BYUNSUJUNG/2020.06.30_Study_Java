package Ch26;

import java.io.*;

// Writer(), BufferedWriter()
// Reader(), BufferedReader()
public class C02SubClassStream {
	public static void main(String[] args) {
		
		String str = "문자 변환 스트림 사용";
		try {
			Writer out = new FileWriter("c:/temp/test11.txt");
			BufferedWriter Bout = new BufferedWriter(out);
			
			Bout.write("This is BufferedReader/Writer Test \n");
			Bout.flush();
			Bout.close();
			out.close();
			
			Reader in = new FileReader("c:/temp/test11.txt");
			BufferedReader Bin = new BufferedReader(in);
			String tmp;
			while(true) {
				tmp = Bin.readLine();
				if(tmp==null) break;
				System.out.println(tmp);
			}
			Bin.close();
			in.close();
			
		} catch (Exception e) {
			
		}
	}
}
