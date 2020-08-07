package Ch33;

import java.sql.*;

// select
public class C01OracleDBConn {
	public static void main(String[] args) throws SQLException {
		// DB ���� ���� ����
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE"; // 1521: ����Ŭ ��Ʈ
		String user="hr";
		String password="hr";
		
		String sql; // sql�����(���� �ӽ�����)
		PreparedStatement pstmt = null; // sql ����� ���� ���� (���� ����) -> ����
		ResultSet rs = null; // sql����� ������ �뵵(���� ��� ����)
		Connection conn = null; // db���� ��ü ���� �� ����(db���� ��ü ����)
		 
		try {
			Class.forName(driver); // ����̹� �ε�
			System.out.println("-- Driver Loading Success !! --");
			conn = DriverManager.getConnection(url, user, password); // DB���� ���� ���
			System.out.println("--- DB Conected ---");
			sql="SELECT * FROM REGIONS"; // REGIONS��� ���̺��� ������ �ҷ���
			pstmt = conn.prepareStatement(sql); // �������� ����
			rs = pstmt.executeQuery(); // ���� ������� ����
			
			int cnt=0; // �ڷ� ����
			while(rs.next()) { // next(): ���� ������ ������ true
				System.out.print(rs.getInt("REGION_ID")+"\t"); // REGION_ID���� ������ int������ ������
				System.out.println(rs.getString("REGION_NAME")+"\t"); // REGION_NAME���� ������ String������ ������
				cnt++;
			}
			if(cnt>0) {
				System.out.println("���� ��ȸ �Ǿ����ϴ�.");
			} else {
				System.out.println("�ش� �ڷᰡ �����ϴ�");
			}
			
			
		} catch(Exception e) {
			rs.close();
			pstmt.close();
			conn.close();
		}
		
		
	}
}
