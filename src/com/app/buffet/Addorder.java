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
public class Addorder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        writer.write("{\n" +
                "    \"result\": 1,\n" +
                "    \"errorCode\": 200,\n" +
                "    \"msg\": \"加单成功\",\n" +
                "    \"data\": {\n" +
                "        \"totalPrice\": 30,\n" +
                "        \"prePrice\": 0.5,\n" +
                "        \"receivePrice\": 29.5,\n" +
                "        \"bsNo\": \"YY192649522\",\n" +
                "        \"bsId\": \"No:459512344\",\n" +
                "        \"itemList\": [\n" +
                "            {\n" +
                "                \"id\": \"15895\",\n" +
                "                \"name\": \"麻辣套餐\",\n" +
                "                \"count\": \"2\",\n" +
                "                \"price\": 15,\n" +
                "                \"totalPrice\": 30,\n" +
                "                \"size\": \"\",\n" +
                "                \"methods\": [\n" +
                "                    {\n" +
                "                        \"name\": \"麻辣\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"name\": \"不要酱油\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"setmealList\": [\n" +
                "                    {\n" +
                "                        \"id\": \"15895\",\n" +
                "                        \"name\": \"麻婆豆腐\",\n" +
                "                        \"count\": \"2\",\n" +
                "                        \"price\": 15,\n" +
                "                        \"totalPrice\": 30,\n" +
                "                        \"size\": \"\",\n" +
                "                        \"methods\": [\n" +
                "                            {\n" +
                "                                \"name\": \"麻辣\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": \"15895\",\n" +
                "                        \"name\": \"麻辣香锅\",\n" +
                "                        \"count\": \"2\",\n" +
                "                        \"price\": 15,\n" +
                "                        \"totalPrice\": 30,\n" +
                "                        \"size\": \"多麻多辣\",\n" +
                "                        \"methods\": [\n" +
                "                            {\n" +
                "                                \"name\": \"麻辣\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"name\": \"不要酱油\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"15895\",\n" +
                "                \"name\": \"麻辣香锅\",\n" +
                "                \"count\": \"2\",\n" +
                "                \"price\": 15,\n" +
                "                \"totalPrice\": 30,\n" +
                "                \"size\": \"小份\",\n" +
                "                \"methods\": [\n" +
                "                    {\n" +
                "                        \"name\": \"麻辣\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"name\": \"不要酱油\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"setmealList\": []\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
