package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "CosFileDownload", value = {"/CosFileDownload" , "/down.do"})
public class CosFileDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            String filename = request.getParameter("filename");
            ServletContext context = getServletContext();
            String realFolder = context.getRealPath("uploaded_files");

            String DirandFilename = realFolder + "//" + filename;

            File file = new File(DirandFilename);

            filename =  new String(filename.getBytes("utf-8"), "ISO-8859-1");


            response.setHeader("Content-Disposition", "attachment;filename=" + filename); // ...???
            response.setContentLength((int)file.length());
            response.setHeader("Cache-Control", "no-cache");

            FileInputStream in = new FileInputStream(file);
            OutputStream out = response.getOutputStream();

            byte [] data = new byte[1024 * 1024];

            int count = -1;
            while ((count = in.read(data)) != -1){
                out.write(data, 0, count);
            }

            in.close();
            out.close();



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

