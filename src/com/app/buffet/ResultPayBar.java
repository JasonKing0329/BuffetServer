package com.app.buffet;

import com.app.buffet.util.AESUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述:
 * <p/>作者：wjx
 * <p/>创建时间: 2017/9/5 9:29
 */
public class ResultPayBar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
        PrintWriter writer = response.getWriter();
        String str="{\n" +
                "    \"data\"       : null,\n" +
                "    \"errorCode\"  : \"200\",\n" +
                "    \"errorText\"  : \"成功\",\n" +
                "    \"returnCode\" : 1\n" +
                "}";
        String str1 = null;
        try {
            str1 = AESUtils.getAesStr(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
        writer.write(str1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
