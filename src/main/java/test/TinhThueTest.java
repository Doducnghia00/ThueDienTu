package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import controller.TinhThue;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class TinhThueTest {

	@Test
	void testCase1() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("11000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("0");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("0", stringWriter.toString()); 
	}
	
	@Test
	void testCase2() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("18000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("1");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("130000", stringWriter.toString()); 
	}
	
	@Test
	void testCase3() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("23000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("1");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("510000", stringWriter.toString()); 
	}
	
	@Test
	void testCase4() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("33000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("2");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("1230000", stringWriter.toString()); 
	}
	
	@Test
	void testCase5() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("44000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("1");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("4070000", stringWriter.toString()); 
	}
	
	@Test
	void testCase6() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("70000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("4");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("7100000", stringWriter.toString()); 
	}
	
	@Test
	void testCase7() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("85000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("4");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("11070000", stringWriter.toString()); 
	}
	
	@Test
	void testCase8() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("tongthunhap")).thenReturn("140000000");
        when(request.getParameter("songuoiphuthuoc")).thenReturn("5");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new TinhThue().doPost(request, response);
        
        assertEquals("27600000", stringWriter.toString()); 
	}

}
