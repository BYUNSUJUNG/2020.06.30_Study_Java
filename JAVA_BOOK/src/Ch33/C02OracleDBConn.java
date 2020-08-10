package Ch33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// select, insert, update, delect 
public class C02OracleDBConn {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// DB ���� ���� ����
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE"; // 1521: ����Ŭ ��Ʈ
		String user="system";
		String password="12345";
		
		
		String sql; // sql�����(���� �ӽ�����)
		PreparedStatement pstmt = null; // sql ������ ���� ���� (���� ����) -> ����
		ResultSet rs = null; // sql����� ������ �뵵(���� ��� ����)
		Connection conn = null; // db���� ��ü ���� �� ����(db���� ��ü ����)
		
		String NAME = null;
		String ADDR = null;
		int i = 1;
		
		try {
			Class.forName(driver); // ����̹� �ε�
			System.out.println("-- Driver Loading Success !! --");
			conn = DriverManager.getConnection(url, user, password); // DB���� ���� ���
			System.out.println("--- DB Conected ---");
			/*
			// 1. insert
			System.out.println("------- STDInfo Table�� �̸�/�ּ� Insert -------");
			
			sql="SELECT * FROM REGIONS"; // REGIONS��� ���̺��� ������ �ҷ���
			
			
			while(true) {
				// �̸� �Է�
				System.out.print("�̸�(q:����): ");
				NAME=scan.nextLine();
				if(NAME.equals("q"))
					break;
				// �ּ� �Է�
				System.out.print("�ּ�(q:����): ");
				ADDR=scan.nextLine();
				if(ADDR.equals("q"))
					break;
				// ����
				pstmt = conn.prepareStatement("INSERT INTO STDInfo VALUES(?,?,?)"); // �̸� �Է��� ������ ��
				pstmt.setInt(1,i);
				pstmt.setString(2,NAME);
				pstmt.setString(3,ADDR);
				i++;
				pstmt.executeUpdate(); // ���� ������Ʈ
			}
			
			// 2. select
			System.out.println("------- STDInfo Table�� �̸�/�ּ� select -------");
			
			sql="SELECT * FROM STDInfo"; // REGIONS��� ���̺��� ������ �ҷ���
			pstmt = conn.prepareStatement(sql); // �������� ����
			rs = pstmt.executeQuery(); // ���� ������� ����
			
			while(rs.next()) { // next(): ���� ������ ������ true
				System.out.print(rs.getInt("NO")+"\t"); // NO���� ������ int������ ������
				System.out.println(rs.getString("NAME")+"\t"); // NAME���� ������ String������ ������
				System.out.println(rs.getString("ADDR")+"\t"); // ADDR���� ������ String������ ������
			}
			
			// 3. update
			System.out.println("------- STDInfo Table�� �̸�/�ּ� update -------");
			
			// �̸� �Է�
			System.out.print("�̸�: ");
			NAME=scan.nextLine();
			// �ּ� �Է�
			System.out.print("���� �ּ�: ");
			ADDR=scan.nextLine();
			// ����
			pstmt = conn.prepareStatement("UPDATE STDInfo SET ADDR=? WHERE NAME=?"); // �̸� �Է��� ������ ��
			pstmt.setString(1,ADDR);
			pstmt.setString(2,NAME);
			pstmt.executeUpdate(); // ���� ������Ʈ
			System.out.println("---- "+NAME+"�� �ּҰ�"+ADDR+"�� �ٲ�����ϴ�. ----");
			
			*/
			
			// 4. delete
			System.out.println("------- STDInfo Table�� �̸�/�ּ� delete -------");
			
			// �̸� �Է�
			System.out.print("���� �̸�: ");
			NAME=scan.nextLine();
			pstmt = conn.prepareStatement("DELETE STDInfo WHERE NAME=?"); // �̸� �Է��� ������ ��
			pstmt.setString(1,NAME);
			pstmt.executeUpdate(); // ���� ������Ʈ
			System.out.println("---- "+NAME+"�� ������ �����Ǿ����ϴ�. ----");
			
			
			// 5. select
			System.out.println("------- STDInfo Table�� �̸�/�ּ� select -------");
			
			sql="SELECT * FROM STDInfo"; // REGIONS��� ���̺��� ������ �ҷ���
			pstmt = conn.prepareStatement(sql); // �������� ����
			rs = pstmt.executeQuery(); // ���� ������� ����
			
			while(rs.next()) { // next(): ���� ������ ������ true
				System.out.print(rs.getInt("NO")+"\t"); // NO���� ������ int������ ������
				System.out.println(rs.getString("NAME")+"\t"); // NAME���� ������ String������ ������
				System.out.println(rs.getString("ADDR")+"\t"); // ADDR���� ������ String������ ������
			}
			
		} catch(Exception e) {
			
		}
	}
}