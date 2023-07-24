package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Enumeration;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;


@WebServlet(name = "COS", value = { "/COS" , "/cos"  })
public class Cos extends HttpServlet {
    public static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        String realFolder = context.getRealPath("uploaded_files");


        int sizelimit = 10 * 1024 * 1024;
        String encType = "utf-8";
        DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();


        try {
            MultipartRequest multi = new MultipartRequest(request, realFolder, sizelimit, encType, policy);
            Enumeration param = multi.getParameterNames();
            while (param.hasMoreElements()) {
                String name = (String) param.nextElement();
                String value = multi.getParameter(name);
                out.println(name + " : " + value + "<br>");
            }


            out.println("<br><hr><br>");
            Enumeration files = multi.getFileNames();
            while (files.hasMoreElements()) {
                String userFilename = (String) files.nextElement();
                String originalFilename = multi.getOriginalFileName(userFilename);


                if (originalFilename != null) {
                    out.println("originalFilename : " + originalFilename + "<br>");

                    String fileSystemFileName = multi.getFilesystemName(userFilename);
                    out.println("fileSystemFileName : " + fileSystemFileName + "<br>");
                    out.println("<br>");

                    File userFile = multi.getFile(userFilename);
                    int fileSize = (int) userFile.length();
                    fileSystemFileName  = URLEncoder.encode(fileSystemFileName, "utf-8");

                    out.println("<a href=down.do?filename  " + fileSystemFileName + "파일다운" + "</a><br>");



                    if (fileSize > 0) {
                        out.println("fileSize : " + fileSize + "<br>");
                        out.println("<br>");
                        out.println("종류 : " + multi.getContentType(userFilename) + "<br>");
                    }

                    out.println("<br><hr><br>");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
