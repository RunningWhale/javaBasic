package org.example.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BmiAjax extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        Float h = Float.valueOf(height);
        Float w = Float.valueOf(weight);
        float bmi = w / (h * h);
        String msg;
        if (bmi <= 18.5) {
            msg = "您比较瘦";
        } else if (bmi > 18.5 && bmi <= 23.9) {
            msg = "您身材正常";
        } else if (bmi > 23.9 && bmi <= 27) {
            msg = "您比较胖";
        } else {
            msg = "您的身材非常胖";
        }
        System.out.println("msg" + msg);
        msg = "您好，" + name + ",您的BMI是 " + bmi + "," + msg;

        PrintWriter writer = resp.getWriter();
        writer.println(msg);
        writer.flush();
        writer.close();
    }
}
