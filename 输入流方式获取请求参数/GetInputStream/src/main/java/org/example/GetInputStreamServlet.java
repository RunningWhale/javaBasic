package org.example;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/getinputstream")
public class GetInputStreamServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf8");
        ServletInputStream inputStream = req.getInputStream();//获取输入流，可以进行文件上传等操作
        OutputStream outputStream = new FileOutputStream("C:\\Users\\23894\\Documents\\Projects\\git仓库\\javaBasic\\输入流方式获取请求参数\\GetInputStream\\outputStream.txt");
        byte[] buf = new byte[1024];
        while (true) {
            int m = inputStream.read(buf);
            if (m==-1){
                break;
            }else {
                outputStream.write(buf);
              }
        }
        outputStream.close();
    }
}
