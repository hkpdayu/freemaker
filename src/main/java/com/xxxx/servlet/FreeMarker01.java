package com.xxxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/f01")
public class FreeMarker01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //添加数据
        req.setAttribute("msg","Hello freemarker");
        //请求转发到指定的模板页面  template/f01.ftl
        req.getRequestDispatcher("template/f01.ftl").forward(req,resp);
    }
}
