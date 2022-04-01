package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

import java.io.IOException;

import dao.DangKyThueDao;

/**
 * Servlet implementation class GuiGiayTo
 */
@WebServlet("/GuiGiayTo")
@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
  maxFileSize = 1024 * 1024 * 10,      // 10 MB
  maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class GuiGiayTo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GuiGiayTo() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ChoDuyet.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part filePart = request.getPart("file");
	    
		String fileName;
		int id = 0;
		// Lay id to dang ky thue
		DangKyThueDao dangKyThueDao = new DangKyThueDao();
		id =  dangKyThueDao.layIdCuoi();
		System.out.println(id);
		// Dat ten file theo id
		if(id == 0 ) {
			fileName = filePart.getSubmittedFileName();
		}else {
			fileName = filePart.getSubmittedFileName();
			int lastPosition = fileName.lastIndexOf(".");
			fileName = "ID" + Integer.toString(id) +fileName.substring(lastPosition);
		}
		// Luu file vao D:\\ThueData\\
	    for (Part part : request.getParts()) {
	      part.write("D:\\ThueData\\" + fileName);
	    }
	    response.getWriter().print("The file uploaded sucessfully. Name = " + fileName);
		doGet(request, response);
	}

}
