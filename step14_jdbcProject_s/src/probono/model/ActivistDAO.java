/* CREATE TABLE activist (
       activist_id          VARCHAR2(20)  PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       major                VARCHAR2(50) NULL
);  */
package probono.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import probono.model.dto.ActivistDTO;
import probono.model.dto.ProbonoProjectDTO;
import probono.model.util.DBUtil;
//����� table�� ����� DAO Ŭ���� 
public class ActivistDAO {
		//����� ���(insert)
		public static boolean addActivist(ActivistDTO activist) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(DBUtil.getsql("addActivist"));
				pstmt.setString(1, activist.getId());
				pstmt.setString(2, activist.getName());
				pstmt.setString(3, activist.getPassword());
				pstmt.setString(4, activist.getMajor());
				
				int result = pstmt.executeUpdate();
			
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}
	
		//����  
		//����� id�� �ֿ� ��� ���� �����ϱ�
		public static boolean updateActivist(String activistId, String major) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				
				pstmt = con.prepareStatement(DBUtil.getsql("updateActivist"));
				pstmt.setString(1, major);
				pstmt.setString(2, activistId);
				
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}		
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}

	
		//����� ����
		//sql - delete from activist where activist_id=?
		public static boolean deleteActivist(String activistId) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(DBUtil.getsql("deleteActivist"));
				pstmt.setString(1, activistId);
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}
			}catch(SQLException s){
				s.printStackTrace();
				throw s;
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}
	
		//id�� �ش� ������� ��� ���� ��ȯ
		public static ActivistDTO getActivist(String activistId) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ActivistDTO activist = null;
			
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(DBUtil.getsql("getActivist"));
				pstmt.setString(1, activistId);
				rset = pstmt.executeQuery();
				if(rset.next()){
					activist = new ActivistDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4));
				}			
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return activist;
		}

		//???��� ����� �˻��ؼ� ��ȯ
		//sql - select * from activist
		public static ArrayList<ActivistDTO> getAllActivists() throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<ActivistDTO> list = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(DBUtil.getsql("getAllActivists"));
				rset = pstmt.executeQuery();
				
				list = new ArrayList<ActivistDTO>();
				while(rset.next()){
					list.add( new ActivistDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4)) );
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return list;
		}
}
