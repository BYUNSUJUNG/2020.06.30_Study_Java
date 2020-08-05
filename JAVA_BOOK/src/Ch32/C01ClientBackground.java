package Ch32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class C01ClientBackground {

	//���Ͽ���
	//������ �ۼ���
	
	Socket client;
	DataInputStream in;
	DataOutputStream out;
	
	C01ClientUI gui;
	
	void setting(C01ClientUI ui) {
		gui=ui;
	}
	
	void Conn() {
		//�������ӿ�û
		//��Ʈ������
		//���ŵ����͸� UI Area.append
		try {
			client = new Socket("192.168.3.5",8888);
			
			in=new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			out.writeUTF("Ŭ���̾�Ʈ ���� �Ϸ� \n");
			String msg;
			//������ ����ó��
			while(in!=null) {
				msg = in.readUTF();
				gui.appendMsg(msg); // C01ClientUI�� �޼ҵ�
			}
		}catch(Exception e) {}
	}
	
	// throws IOException: �ش� �޼ҵ带 ����� ������ ���ܸ� ó���ϵ��� ��
	// ����ϴ� ������ try-catch���
	void SendMsg(String msg) throws IOException {
		out.writeUTF("[Client] : "+msg);
	}
}