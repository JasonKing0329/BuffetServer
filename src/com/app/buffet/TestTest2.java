package com.app.buffet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述:
 * <p/>作者：wjx
 * <p/>创建时间: 2017/9/5 9:38
 */
public class TestTest2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("lastModifyTime: " + request.getHeader("lastModifyTime"));
        response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        writer.print("{\"result\":true,\n" +
                "\"msg\":\"sadklgjaweioio\",\n" +
                "\"errorCode\":\"200\",\n" +
                "\"lastModifyTime\":\"2017-11-23 15:01:00\",\n" +
                "\"data\":null}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
