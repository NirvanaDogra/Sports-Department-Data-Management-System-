

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/MyJDBC")
public class MyJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver.Class").newInstance();
		
			String url="jdbc:mysql//localhost:3306/mydb";
			String username="root";
			String password="";
			String query="select * from persons6";
			Connection conn;
		
			conn = DriverManager.getConnection(url,username,password);	
		
			 Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 ResultSet rs = stmt.executeQuery(query);
			 out.println("<table>"
				 		+ "<tr>"
				 		+ "<th>First name</th>"
				 		+ "<th>Last name</th>"
				 		+ "<th>Gender</th>"
				 		+ "<th>USN</th>"
				 		+ "<th>Sport</th>"
				 		+ "<th>Tournament</th>"
				 		+ "<th>Semester</th>"
				 		+ "<th>Positon</th>"
				 		+ "<th>Branch</th>"
				 		+ "</tr>");
			 while(rs.next()) {
				 out.println("<tr>"+rs.getString("FirstName")+"</tr>");
				 
			 }
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
