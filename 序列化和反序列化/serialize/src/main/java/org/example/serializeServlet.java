package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

@WebServlet("/serialize")
public class serializeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add(username);
        linkedList.add(password);
        ObjectMapper mapper = new ObjectMapper();//第一步，获取序列化对象
        String s = mapper.writeValueAsString(linkedList);//第二部，执行序列化方法
        PrintWriter writer=resp.getWriter();
        writer.println(s);
    }
}
