package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB 접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "testuser", "test1234");
			// 3. statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. sql 실행(처리)
			// select -> executeQuery : ResultSet리턴
			// insert/update/delete -> executeUpdate : int 리턴
			String sql = "SELECT * FROM student";
			rs = stmt.executeQuery(sql);
			
			// 5. 결과처리(커서 형태)
			while (rs.next()) {
				System.out.println(rs.getString("name")+" "+rs.getString("id"));
			}
			
			// 6. 해제(close) -> finally
			
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//if (conn != null) {
//				try {
//					conn.close();
//					System.out.println("연결 끊기");
//				} catch (Exception e) {}
			//}
			if (rs != null) try {rs.close();}catch(Exception e) {}
			if (stmt != null) try {stmt.close();}catch(Exception e) {}
			if (conn != null) try {conn.close();}catch(Exception e) {}
		}
	}

}






