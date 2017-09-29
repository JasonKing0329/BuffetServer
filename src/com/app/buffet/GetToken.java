package com.app.buffet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述:结算
 * <p/>作者：wjx
 * <p/>创建时间: 2017/9/6 11:30
 */
public class GetToken extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        writer.write("{\"result\": 1,\"errorCode\": 200,\"msg\": \"加单成功\",\"data\":{\"queueNo\":\"NO:895261031452\"}}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
