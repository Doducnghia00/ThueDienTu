package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import controller.NopThue;
import dao.ToNopThueDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

class NopThueTest {

	@Test
	void testSaveData() throws ServletException, IOException {
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		
		when(session.getAttribute("id")).thenReturn(10);
        when(request.getParameter("cqt")).thenReturn("Hà Nội");
        when(request.getParameter("nganhang")).thenReturn("Vietcombank");
        when(request.getParameter("stk")).thenReturn("123456789");
        
        when(request.getParameter("mst")).thenReturn("9999");
        when(request.getParameter("name")).thenReturn("Linh");
        when(request.getParameter("tienso")).thenReturn("5000000");
        when(request.getParameter("tienchu")).thenReturn("Năm triệu đồng");
        when(request.getParameter("cmnd")).thenReturn("037200000444");
        when(request.getParameter("kithueStart")).thenReturn("2022-05-03");
        when(request.getParameter("kithueEnd")).thenReturn("2022-05-04");
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        new NopThue().doPost(request,response);
        new ToNopThueDao().delete();
        assertEquals("success", stringWriter.toString());
	}

}
