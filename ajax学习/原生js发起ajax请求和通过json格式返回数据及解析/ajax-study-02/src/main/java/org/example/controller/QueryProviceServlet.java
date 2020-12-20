package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dao.ProviceDao;
import org.example.entity.Provice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class QueryProviceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf8");
        resp.setContentType("application/json;charset=utf8");
        String proid = req.getParameter("proid");
        PrintWriter writer = resp.getWriter();
        ProviceDao proviceDao = new ProviceDao();
        Integer integer = Integer.valueOf(proid);
        Provice provice=null;
        try {
             provice= proviceDao.querryProviceNameById(integer);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ObjectMapper om=new ObjectMapper();
        String s = om.writeValueAsString(provice);

        writer.println(s);
        writer.flush();
        writer.close();

//        }
    }
}
