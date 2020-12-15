package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@MultipartConfig
@WebServlet("/post-file")
public class PostFile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、从请求体获取文件
        Part file = req.getPart("file");
        String name = file.getSubmittedFileName();//获取上传文件名称
        //2、获取文件输入流
        InputStream inputStream = file.getInputStream();
        //3、创建输出流和输出位置
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\23894\\Desktop\\比特学习文件\\javaweb阶段代码练习\\文件传输练习\\"+name);
        //4、通过buf循环读取数据
        byte[] buf = new byte[1024];
        while (true) {
            int flag = inputStream.read(buf);
            //当文件读取结束返回-1
            if (flag == -1) {
                break;
            } else {
                fileOutputStream.write(buf, 0, flag);
            }
        }
        fileOutputStream.close();

    }
}
