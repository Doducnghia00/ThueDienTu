package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import controller.ThemToKhaiThue;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

class ThemToKhaiThueTEST {
// nop thanh cong
	@Test
	public void testKeKhaiThue1() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemToKhaiThue tokhaithue = new ThemToKhaiThue();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(1);

	when(session.getAttribute("cqt")).thenReturn("Ha Noi");
	when(session.getAttribute("namkekhai")).thenReturn("2021");
	when(request.getParameter("mst")).thenReturn("12443");
	when(request.getParameter("name")).thenReturn("Nguyễn Văn A");
	when(request.getParameter("thunhapvn")).thenReturn("1000000000");
	when(request.getParameter("thunhapnn")).thenReturn("20000000000");
	when(request.getParameter("danop")).thenReturn("1000000");
	when(request.getParameter("tongthue")).thenReturn("7216170000");
	when(request.getParameter("conphainop")).thenReturn("7216170000");
	when(request.getParameter("nopthua")).thenReturn("0");

	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	when(request.getRequestDispatcher("ChoDuyet.jsp")).thenReturn(rd);
	
	tokhaithue.doPost(request, response);
	assertTrue(stringWriter.toString().contains("True"));

	}
// nguoi dung chua dang nhap idUser ="";
	 @Test
	public void testKeKhaiThue2() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemToKhaiThue tokhaithue = new ThemToKhaiThue();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(null);

	when(session.getAttribute("cqt")).thenReturn("Ha Noi");
	when(session.getAttribute("namkekhai")).thenReturn("2021");
	when(request.getParameter("mst")).thenReturn("12443");
	when(request.getParameter("name")).thenReturn("Nguyễn Văn A");
	when(request.getParameter("thunhapvn")).thenReturn("1000000000");
	when(request.getParameter("thunhapnn")).thenReturn("20000000000");
	when(request.getParameter("danop")).thenReturn("1000000");
	when(request.getParameter("tongthue")).thenReturn("7216170000");
	when(request.getParameter("conphainop")).thenReturn("7216170000");
	when(request.getParameter("nopthua")).thenReturn("0");


	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	when(request.getRequestDispatcher("ChoDuyet.jsp")).thenReturn(rd);
	
	tokhaithue.doPost(request, response);
	assertTrue(stringWriter.toString().contains("False"));
	}
// nguoi dung nop mot ban ke khai giong het ban da nop
	 @Test
	public void testKeKhaiThue3() throws Exception {
	HttpServletRequest request = mock(HttpServletRequest.class);       
	HttpServletResponse response = mock(HttpServletResponse.class); 
	ThemToKhaiThue tokhaithue = new ThemToKhaiThue();
	HttpSession session = mock(HttpSession.class);
	when(request.getSession()).thenReturn(session);
	
	when(request.getParameter("fullname")).thenReturn("Nguyen Van A");
	when(session.getAttribute("id")).thenReturn(1);

	when(session.getAttribute("cqt")).thenReturn("Ha Noi");
	when(session.getAttribute("namkekhai")).thenReturn("2021");
	when(request.getParameter("mst")).thenReturn("12443");
	when(request.getParameter("name")).thenReturn("Nguyễn Văn A");
	when(request.getParameter("thunhapvn")).thenReturn("1000000000");
	when(request.getParameter("thunhapnn")).thenReturn("20000000000");
	when(request.getParameter("danop")).thenReturn("1000000");
	when(request.getParameter("tongthue")).thenReturn("7216170000");
	when(request.getParameter("conphainop")).thenReturn("7216170000");
	when(request.getParameter("nopthua")).thenReturn("0");


	StringWriter stringWriter = new StringWriter();
	PrintWriter writer = new PrintWriter(stringWriter);
	when(response.getWriter()).thenReturn(writer);
	
	RequestDispatcher rd = mock(RequestDispatcher.class);
	
	when(request.getRequestDispatcher("dangnhap.jsp")).thenReturn(rd);
	when(request.getRequestDispatcher("ChoDuyet.jsp")).thenReturn(rd);
	
	
	tokhaithue.doPost(request, response);
	assertTrue(stringWriter.toString().contains("False"));
	}
}
