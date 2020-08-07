package Ch33;

import java.sql.*;

// select
public class C01OracleDBConn {
	public static void main(String[] args) throws SQLException {
		// DB 연결 정보 저장
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE"; // 1521: 오라클 포트
		String user="hr";
		String password="hr";
		
		String sql; // sql저장용(쿼리 임시저장)
		PreparedStatement pstmt = null; // sql 명령을 담을 공간 (쿼리 저장) -> 전달
		ResultSet rs = null; // sql결과를 저장할 용도(쿼리 결과 저장)
		Connection conn = null; // db연결 객체 참조 값 저장(db연결 객체 저장)
		 
		try {
			Class.forName(driver); // 드라이버 로딩
			System.out.println("-- Driver Loading Success !! --");
			conn = DriverManager.getConnection(url, user, password); // DB연결 정보 담기
			System.out.println("--- DB Conected ---");
			sql="SELECT * FROM REGIONS"; // REGIONS라는 테이블의 내용을 불러옴
			pstmt = conn.prepareStatement(sql); // 쿼리문을 보냄
			rs = pstmt.executeQuery(); // 쿼리 결과물을 담음
			
			int cnt=0; // 자료 개수
			while(rs.next()) { // next(): 다음 내용이 있으면 true
				System.out.print(rs.getInt("REGION_ID")+"\t"); // REGION_ID열의 내용을 int형으로 가져옴
				System.out.println(rs.getString("REGION_NAME")+"\t"); // REGION_NAME열의 내용을 String형으로 가져옴
				cnt++;
			}
			if(cnt>0) {
				System.out.println("정상 조회 되었습니다.");
			} else {
				System.out.println("해당 자료가 없습니다");
			}
			
			
		} catch(Exception e) {
			rs.close();
			pstmt.close();
			conn.close();
		}
		
		
	}
}
