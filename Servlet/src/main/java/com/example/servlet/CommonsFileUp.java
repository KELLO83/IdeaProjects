package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


import  java.io.File;
import  java.io.IOException;
import  java.io.PrintWriter;
import  java.util.List;

import  org.apache.commons.fileupload.FileItem;
import  org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import  org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/commons")
public class CommonsFileUp extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding( "utf-8" );
        response.setContentType( "text/html;charset=utf-8" );
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        String realFolder = context.getRealPath( "uploaded_files" );

        DiskFileItemFactory factory = new DiskFileItemFactory();

        factory.setSizeThreshold(1024*1024 );

        File currentDirAndPah = new File( realFolder );
        factory.setRepository(currentDirAndPah);

        ServletFileUpload upload = new ServletFileUpload(factory);

        try{
            List<FileItem> items = upload.parseRequest(request);

            for(int i =0 ; i<items.size() ;i++){
                FileItem fileItem = (FileItem)items.get(i);

                if(fileItem.isFormField()){

                    out.println(fileItem.getFieldName()+":"+fileItem.getString("utf-8")+"<br><br>");
                }
                else {
                    if(fileItem.getSize() >0 ){
                        String fileName = (String) fileItem.getName();
                        out.println("fileNmae : <br>" + fileName + "<br><br>");
                        String DirAndFilename = realFolder + "\\" + fileName;
                        out.println("Directory+Filename : <br>" + DirAndFilename + "<br><br>");

                        File uploadFile = new File(DirAndFilename);

                        if(uploadFile.exists()){
                            int pos = fileName.lastIndexOf(".");
                            String fname = fileName.substring(0,pos);
                            String fext = fileName.substring(pos+1);

                            for(int j=1 ; true ; j++){
                                fileName = fname + "(" + j + ")." + fext;

                                DirAndFilename = realFolder = "\\" + fileName;
                                uploadFile = new File(DirAndFilename);

                                if(!(uploadFile.exists())){
                                    break;
                                }
                            }
                        }
                    }
                    String fileName = (String) fileItem.getName();
                    File uploadFile = new File(realFolder + "\\" + fileName);
                    fileItem.write(uploadFile);


                    out.println("File Size : <br>" + fileItem.getSize() + "<br><br>");


                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
