package loginservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/reg")
public class Loginservlet extends HttpServlet {
	
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
Student st=new Student();
st.setFirstName(request.getParameter("firstName"));
st.setLastName(request.getParameter("lastName"));
st.setMobileNumber(Integer.parseInt(request.getParameter("mobileNumber")));
st.setEmailId(request.getParameter("mailId"));
st.setPassword(request.getParameter("Password1"));
st.setReTypePassword(request.getParameter("Password2"));

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysq://local host:3306/test","root","root");
	String sql="insert into employee values(?,?,?,?,?,?)";
	PreparedStatement ps= con.prepareStatement(sql);
	ps.setString(1,st. getFirstName());
	ps.setString(2, st.getLastName());
	ps.setInt(3, st.getMobileNumber());
	ps.setString(4,st. getEmailId());
	ps.setString(5,st. getPassword());
	ps.setString(6,st.getPassword() );
	
	
}
catch(Exception e1){
	
e1.printStackTrace();
System.out.print(e1.getMessage());
}

}

}




