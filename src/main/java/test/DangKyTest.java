package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.jasper.tagplugins.jstl.core.When;
import org.junit.jupiter.api.Test;

import controller.DangKy;
import dao.TaiKhoanDao;
import jakarta.servlet.RequestDispatcher;
//import controller.DangKy;
//import controller.DangNhap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class DangKyTest {

	@Test
	void test() throws ServletException, IOException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);
        
        DangKy dangKyServlet=new DangKy();
        TaiKhoanDao  tkd = new TaiKhoanDao();
        when(request.getParameter("username")).thenReturn("10");
        when(request.getParameter("password")).thenReturn("2");
        when(request.getParameter("repassword")).thenReturn("2");
        when(request.getParameter("hoten")).thenReturn("abc");
       when(request.getParameter("ngaysinh")).thenReturn("11/01/2000");
        when(request.getParameter("diachi")).thenReturn("abc");
        when(request.getParameter("sodienthoai")).thenReturn("1");
        when(request.getParameter("email")).thenReturn("abc");
      
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
       
        RequestDispatcher rd = mock(RequestDispatcher.class);
		when(request.getRequestDispatcher("dangky.jsp")).thenReturn(rd);
        
        dangKyServlet.doPost(request, response);
        System.out.print(stringWriter);
        tkd.delete();
       assertTrue(stringWriter.toString().contains("True"));
		
	}
}