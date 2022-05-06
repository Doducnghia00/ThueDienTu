package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import controller.KeKhaiNPT;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

class KeKhaiNPTTEST {
	

	
	@Test
	public void testGetNPTOfUser1() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
		HttpServletResponse response = mock(HttpServletResponse.class); 
		KeKhaiNPT kekhainpt = new KeKhaiNPT();
		HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("id")).thenReturn(1);
	
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);
		
		RequestDispatcher rd = mock(RequestDispatcher.class);
		
		when(request.getRequestDispatcher("KeKhaiNPT.jsp")).thenReturn(rd);
		
		kekhainpt.doGet(request, response);
		
		//verify(rd).forward(request, response);
		assertTrue(stringWriter.toString().contains("True"));
	}
	
	// nguoi dung chua dang nhap idUser = ""
	 @Test
	public void testGetNPTOfUser2() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
		HttpServletResponse response = mock(HttpServletResponse.class); 
		KeKhaiNPT kekhainpt = new KeKhaiNPT();
		HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("id")).thenReturn(null);
	
	
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);
		
		RequestDispatcher rd = mock(RequestDispatcher.class);
		
		when(request.getRequestDispatcher("KeKhaiNPT.jsp")).thenReturn(rd);
		
		kekhainpt.doGet(request, response);
		assertTrue(stringWriter.toString().contains("False"));
	}

	// nguoi dung chua ke khai nguoi phu thuoc
	 @Test
	public void testGetNPTOfUser3() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
		HttpServletResponse response = mock(HttpServletResponse.class); 
		KeKhaiNPT kekhainpt = new KeKhaiNPT();
		HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("id")).thenReturn(10);
	
	
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);
		
		RequestDispatcher rd = mock(RequestDispatcher.class);
		
		when(request.getRequestDispatcher("KeKhaiNPT.jsp")).thenReturn(rd);
		
		kekhainpt.doGet(request, response);
		assertTrue(stringWriter.toString().contains("False"));
	}

}
