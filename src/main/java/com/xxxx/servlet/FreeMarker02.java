package com.xxxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/f02")
public class FreeMarker02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //添加日期
        req.setAttribute("date",new Date());
        //添加数据
        req.setAttribute("msg1","Hello");
        req.setAttribute("msg2","FreeMarker");

        //请求转发到指定模板的页面
        req.getRequestDispatcher("template/f02.ftl").forward(req,resp);
    }
}
