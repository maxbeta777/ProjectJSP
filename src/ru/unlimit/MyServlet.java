package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
//		String job = request.getParameter("job");
		String jobs[] = request.getParameterValues("job");
		String gender = request.getParameter("gender");
		if(gender==null){
			gender = "-";
		}
		String age18 = request.getParameter("age18");
		if(age18==null){
			age18 = "-";
		}
		System.out.println(name);
		System.out.println(surname);
		System.out.println(Arrays.toString(jobs));
		System.out.println(gender);
		System.out.println(age18);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>������� ����������:</h3>");
		out.println("���: "+name+"<br>");
		out.println("�������: "+surname+"<br>");
//		out.println("���������: "+job+"<br>");
		out.println("���������: "+jobs.length+" ");
		out.println(Arrays.toString(jobs)+"<br>");
//		for (String job : jobs){
//			out.println(job+"<br>");
//		}
		out.println("���: "+gender+"<br>");
		out.println("������ 18: "+age18+"<br>");
		out.close();
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		System.out.println(name);
		System.out.println(surname);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello from Servlet.Post "+name+" "+surname+"</h3>");
		out.close();
	}

}
