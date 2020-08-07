package Ch34;

import java.sql.*;

public class C01DBConn {
	// DB 연결 정보 저장
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // 1521: 오라클 포트
	String user="system";
	String password="12345";
	
	String sql; // sql저장용(쿼리 임시저장)
	PreparedStatement pstmt = null; // sql 명령을 담을 공간 (쿼리 저장) -> 전달
	ResultSet rs = null; // sql결과를 저장할 용도(쿼리 결과 저장)
	Connection conn = null; // db연결 객체 참조 값 저장(db연결 객체 저장)
	
	C01DBUI gui;
	
	void setting(C01DBUI ui) {
		gui = ui;
	}
	
	// 생성자가 실행될 때 디비연동
	C01DBConn() {
		try {
			Class.forName(driver); // 드라이버 로딩
			System.out.println("-- Driver Loading Success !! --");
			conn = DriverManager.getConnection(url, user, password); // DB연결 정보 담기
			System.out.println("--- DB Conected ---");
			
		} catch(Exception e) {
			
		}
	}
	
	void INSERT(int no, String name, String dept, String score) {
		// 쿼리
		try {
			pstmt = conn.prepareStatement("INSERT INTO ScoreTbl VALUES(?,?,?,?)"); // 미리 입력할 쿼리를 씀
			pstmt.setInt(1,no);
			pstmt.setString(2,name);
			pstmt.setString(3,dept);
			pstmt.setString(4,score);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
	
	}
	void UPDATE(int no, String name, String dept, String score) {
		try {
			pstmt = conn.prepareStatement("UPDATE ScoreTbl SET NAME=?, DEPT=?, SCORE=? WHERE NO=?");
			pstmt.setString(1,name);
			pstmt.setString(2,dept);
			pstmt.setString(3,score);
			pstmt.setInt(4,no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
	}
	void DELETE(int no) {
		try {
			pstmt = conn.prepareStatement("DELETE ScoreTbl WHERE NO=?"); // 미리 입력할 쿼리를 씀
			pstmt.setInt(1,no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
		
	}
	void SELECT(int no) {
		
	}
}
