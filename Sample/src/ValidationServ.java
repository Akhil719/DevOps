import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ValidationServ extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ArrayList al = new ArrayList();
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String sno1 = req.getParameter("validpro_sno");
		String sname = req.getParameter("validpro_sname");
		String smarks1 = req.getParameter("validpro_smarks");
		int sno = 0;
		int smarks = 0;
		System.out.println("sno1"+sno1);
		System.out.println("sname"+sname);
		System.out.println("smarks1"+smarks1);
		
		System.out.println("sno1"+Integer.parseInt(sno1));
		System.out.println("smarks1"+Integer.parseInt(smarks1));
		
		if ((sno1 == null) || (sno1.equals(""))) {
			al.add("PROVIDE STUDENT NUMBER...");
		} else {
			try {
				sno = Integer.parseInt("sno1");
			} catch (NumberFormatException nfe) {
				al.add("PROVIDE int DATA IN STUDENT NUMBER...");
			}
		}
		if ((sname == null) || (sname.equals(""))) {
			al.add("PROVIDE STUDENT NAME...");
		}
		if ((smarks1 == null) || (smarks1.equals(""))) {
			al.add("PROVIDE STUDENT MARKS...");
		} else {
			try {
				smarks = Integer.parseInt("smarks1");
			} catch (NumberFormatException nfe) {
				al.add("PROVIDE float DATA IN STUDENT MARKS...");
			}
		}
		System.out.println("a1.size"+al.size());
		if (al.size()== 0) {
			pw.println(al);
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/test", "root", "root");
				System.out.println("connecting mysql ");
				if(!con.isClosed()){
					System.out.println("mysql database connected");
				}
				PreparedStatement ps = con
						.prepareStatement("insert into student values(?,?,?)");
				sno = Integer.parseInt(sno1);
				smarks = Integer.parseInt(smarks1);
				ps.setInt(1,sno);
				ps.setString(2, sname);
				ps.setInt(3, smarks);
		
				int i = ps.executeUpdate();
				if (i > 0) {
					pw.println("RECORD INSERTED...");
				} else {
					pw.println("RECORD NOT INSERTED...");
				}
				con.close();
			} catch (Exception e) {
				res.sendError(503, "PROBLEM IN DATABASE...");
			}
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}