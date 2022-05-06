package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import controller.ThemNPT;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

class ThemNPTTEST {

	@Test
	public void testThemNPT1() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemNPT themnpt = new ThemNPT();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(1);

	when(request.getParameter("dob")).thenReturn("2000-01-01");
	when(request.getParameter("address")).thenReturn("Ha Noi");
	when(request.getParameter("cmnd")).thenReturn("");
	when(request.getParameter("relationship")).thenReturn("Anh");


	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	
	themnpt.doPost(request, response);
	assertTrue(stringWriter.toString().contains("True"));
//	themnpt.rollback();

	}
	// them nguoi phu thuoc nhưng chưa đăng nhập idUser= ""
	 @Test
	public void testThemNPT2() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemNPT themnpt = new ThemNPT();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(null);

	when(request.getParameter("dob")).thenReturn("2000-01-01");
	when(request.getParameter("address")).thenReturn("Ha Noi");
	when(request.getParameter("cmnd")).thenReturn("");
	when(request.getParameter("relationship")).thenReturn("Anh");


	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	
	themnpt.doPost(request, response);
	assertTrue(stringWriter.toString().contains("False"));
	}

	// them nguoi phu thuoc nhưng chưa đăng nhập idUser= ""
	 @Test
	public void testThemNPT3() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemNPT themnpt = new ThemNPT();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(1);

	when(request.getParameter("dob")).thenReturn("2000-01-01");
	when(request.getParameter("address")).thenReturn("Ha Noi");
	when(request.getParameter("cmnd")).thenReturn("");
	when(request.getParameter("relationship")).thenReturn("Anh");


	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	
	themnpt.doPost(request, response);
	assertTrue(stringWriter.toString().contains("False"));
//	themnpt.rollback();

	}

}
