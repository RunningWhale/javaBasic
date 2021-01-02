package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MyController {
    @RequestMapping("/returnString.do")
    /*public String doSome(String  name){
        return "result";

    }*/
    //手动添加数据到request作用域
    public String doSome(HttpServletRequest request, String  name){
        request.setAttribute("myname",name);
        return "result";

    }
    @RequestMapping("/returnvoid.do")
    public void doSome2(HttpServletResponse response,String name,Integer age) throws IOException {

        ObjectMapper om=new ObjectMapper();
       String json=om.writeValueAsString(name+age);
       response.setContentType(" application/json;charset=utf8");
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }
}
