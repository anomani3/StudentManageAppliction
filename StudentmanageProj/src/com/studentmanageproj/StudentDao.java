package com.studentmanageproj;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class StudentDao {
	public static boolean insertIntoDB(Student st){
		boolean f=false;
//		jdbc code
		try {
			
			Connection con=ConnProvider.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
//			prepared statement
			PreparedStatement pstmt=con.prepareStatement(q);
//			Set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentphone());
			pstmt.setString(3, st.getStudentCity());
			
//			execute query
			pstmt.executeUpdate();
			f=true;
			
			
			
			
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int userid) {
		
		boolean f=false;
//		jdbc code
		try {
			
			Connection con=ConnProvider.createC();
			String q="delete from students where sid=?";
//			prepared statement
			PreparedStatement pstmt=con.prepareStatement(q);
//			Set the values of parameter
			pstmt.setInt(1,userid);
			
//			execute query
			pstmt.executeUpdate();
			f=true;
			
			
			
			
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	
		
	}

	public static  boolean showAllStudents() {
		boolean f=false;
//		jdbc code
		try {
			
			Connection con=ConnProvider.createC();
			String q="select * from students";
//			statement
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(q);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString("scity");
				
				System.out.println("Id :"+id);
				System.out.println("Name :"+ name);
				System.out.println("Phone :"+ phone);
				System.out.println("City :"+city);
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				
				
				
			}
			
			
			
//			Set the values of parameter
			
			
//			execute query
			
			f=true;
			
			
			
			
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
		
	}
}
