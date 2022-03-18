/*
 * oracle 접속 db연동 코드를 mysql db 접속 코드로 변환
 * 
 * 1. driver를 build path에 추가는 강사와 함께
 * 2. 로딩~ 자원반환 코드 일부 수정
 * 
 * 3.
 * 	database이름은 playdata
 * 
 * 
 * 4. insert.update.delete 추가 구현 방식 학습
 */
package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest2 {
	
	public static void main(String[] args) {
		insert();		
	}
	//특정 데이터를 메소드 내부에 구성해서 저장
	public static void insert() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://mydb-1.cfxsa8hbhbwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimezone=UTC";
			
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			Statement stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')");
			
			System.out.println(rset + "행 저장 성공");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	public static void select() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://mydb-1.cfxsa8hbhbwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimezone=UTC";
			
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			
			Statement stmt = con.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println(rset.getInt("deptno") + "\t" +
									rset.getString("dname") + "\t" +
									rset.getString("loc"));
			}
			
			rset.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
