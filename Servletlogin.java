package loginservlet;

import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/logo")
public class Servletlogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String un=request.getParameter("mailid");
		String pa=request.getParameter("Password");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysq://local host:3306/test","root","root");
			String sql="select*from employee where mailid=?andPassword=?";
			Statement ps=con.createStatement();
			((PreparedStatement) ps).setString(1,"mailid");
			((PreparedStatement) ps).setString(2,"Password");
			ResultSet rs=ps.executeQuery(sql);
			
			Arraylist e1=new Arraylist();
			
			while (rs.next());{
				Student s=new Student();
				s.setEmailId(rs.get);
				
			}
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
			System.out.print(e1.getMessage());
		}
	}	
	}
	


