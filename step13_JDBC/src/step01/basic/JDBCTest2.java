/*
 * oracle ���� db���� �ڵ带 mysql db ���� �ڵ�� ��ȯ
 * 
 * 1. driver�� build path�� �߰��� ����� �Բ�
 * 2. �ε�~ �ڿ���ȯ �ڵ� �Ϻ� ����
 * 
 * 3.
 * 	database�̸��� playdata
 * 
 * 
 * 4. insert.update.delete �߰� ���� ��� �н�
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
	//Ư�� �����͸� �޼ҵ� ���ο� �����ؼ� ����
	public static void insert() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://mydb-1.cfxsa8hbhbwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimezone=UTC";
			
			Connection con = DriverManager.getConnection(url, "encore", "playdata");
			Statement stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')");
			
			System.out.println(rset + "�� ���� ����");
			
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
