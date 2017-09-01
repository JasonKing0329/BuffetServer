package com.app.buffet;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    private Gson gson;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("doGet ok");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("tcslKey:" + req.getHeader("tcslKey"));
        System.out.println("data:" + req.getParameter("data"));
        if (gson == null) {
            gson = new Gson();
        }
        TestBean bean = new TestBean();
        bean.setErrorCode(200);
        bean.setMsg("成功");
        String json = gson.toJson(bean);
        System.out.println("json:" + json);
        resp.getWriter().print(json);
    }
}
