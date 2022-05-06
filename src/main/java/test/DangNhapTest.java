package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.jasper.tagplugins.jstl.core.When;
import org.junit.jupiter.api.Test;

import controller.DangNhapServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

class DangNhapTest {

	@Test
	void test() throws ServletException, IOException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        DangNhapServlet dangNhapServlet=new DangNhapServlet();
        when(request.getParameter("username")).thenReturn("1");
        when(request.getParameter("password")).thenReturn("1");
        when(request.getSession()).thenReturn(session);
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        RequestDispatcher rd = mock(RequestDispatcher.class);
		when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
		when(request.getRequestDispatcher("home.jsp")).thenReturn(rd);
		
        dangNhapServlet.doPost(request, response);
        System.out.print(stringWriter);
        assertTrue(stringWriter.toString().contains("True"));
		
	}
}