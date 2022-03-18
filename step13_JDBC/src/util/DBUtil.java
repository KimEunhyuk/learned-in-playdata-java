//��� DAO�� ���������� ���Ǵ� �ڵ��θ� ������ ������ ����
/*
 * Properties ��ü ���� ��ġ?
 * 	��� ������? ���� ������? ���������.
 * 		�� ��ü�� �뵵
 * 		- properties�� ������ ����
 * 		- static{} - driver ���� Ȱ��
 * 		- getConnection() - url/id/pw ���� Ȱ��
 */

package util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	static Properties dbInfo = new Properties();
	
	
	/*
	 * static {} - ���ѹ� ���� 100% ����
	 * 	- �̸��� ���� ������ ȣ�� �Ұ�
	 * 	- �������� �����ϴ� �ڿ��� �ѹ��� �ʱ�ȭ �ϰ��� �ϴ� �������� ����
	 */
	
	static {
		try {
//			1�ܰ�
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2�ܰ�
			dbInfo.load(new FileReader("src/dbinfo.properties"));
			Class.forName(dbInfo.getProperty("jdbc.driver"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	// ���� �����ؼ��� �ȵǴ� ��ü / ��û�� ���� ���� �����ؼ� ����
	// ���� ������ Connection ��ü ��ȯ / ���� ���н� ���� �߻�
	/*
	 * ���� ó���� ������ ����� �ݵ�� ȣ���� �������� ��Ȳ �ľ� �ʼ�
	 * try~catch�� ���� ó������ throws�� ��Ȳ�� ���� �˸����ε� ���
	 * 
	 * �޼ҵ� body {}
	 * 	1. throw new Exception������ �ʼ�
	 * 	2. ���� ó�� ���� �߻��� ���ܸ� ȣ���� ������ �������� �� ���
	 * 		catch ��� ���ο��� throw ���ܺ���;�� ó�� �ϱ⵵��
	 */
	public static Connection getConnection() throws SQLException {
		String url 
//		= "jdbc:mysql://mydb-1.cfxsa8hbhbwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimezone=UTC";
		= "jdbc:mysql://mysqldb.cfxsa8hbhbwu.ap-northeast-2.rds.amazonaws.com:3306/playdata?serverTimezone=UTC";
		
//		return DriverManager.getConnection(url, "encore", "playdata");
		return DriverManager.getConnection(dbInfo.getProperty("jdbc.url"),
											dbInfo.getProperty("jdbc.id"),
											dbInfo.getProperty("jdbc.pw"));
		
	}
	
	// ��� DAO Ŭ�������� ��� �޼ҵ尡 �ݵ�� �����ϴ� �ڿ���ȯ ������ �޼ҵ�
	//select - ResultSet -> Statement -> Connection ��
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if(rset != null) {
				rset.close();
				rset = null;
			}				
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
				con = null;
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Connection con, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
				con = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//insert/update/delete - Statement -> Connection ��
	
	
	
	

}
