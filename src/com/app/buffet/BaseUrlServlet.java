package com.app.buffet;

import com.app.buffet.bean.response.BasicUrlResponse;
import com.app.buffet.bean.response.BuffetResponse;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseUrlServlet extends HttpServlet {

    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        sendResponse(resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        sendResponse(resp);
    }

    private void sendResponse(HttpServletResponse resp) throws IOException {
        BasicUrlResponse response = new BasicUrlResponse();
        response.setUrl("/BuffetServer");

        BuffetResponse<BasicUrlResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(response);
        String json = gson.toJson(responseBean);
        System.out.println(getClass().getName() + "[sendResponse]" + json);
        // 内存中加载的file文件名是utf-8编码的汉字，response的时候要设置下面这个header信息
        resp.setContentType("text/html;charset=UTF-8"); //目的是为了控制浏览器的行为，即控制浏览器用UTF-8进行解码；
        resp.setCharacterEncoding("UTF-8"); //的目的是用于response.getWriter()输出的字符流的乱码问题，如果是response.getOutputStream()是不需要此种解决方案的；因为这句话的意思是为了将response对象中的数据以UTF-8解码后发向浏览器；
        resp.getWriter().print(json);
    }

}
