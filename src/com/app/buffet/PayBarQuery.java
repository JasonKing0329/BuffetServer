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
 * <p/>创建时间: 2017/9/5 14:58
 */
public class PayBarQuery extends HttpServlet {
    int time=0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
        PrintWriter writer = response.getWriter();
        time++;
        String str;
        if(time<1) {
            str= "{\n" +
                    "  \"errorText\": \"成功\",\n" +
                    "  \"returnCode\": 1,\n" +
                    "  \"data\": {\n" +
                    "    \"attach\": \"xia***@126.com\",\n" +
                    "    \"mdiscount\": \"0.0\",\n" +
                    "    \"ret_code\": 1,\n" +
                    "    \"ret_msg\": \"\",\n" +
                    "    \"time_end\": \"2017-05-08 14:13:02\",\n" +
                    "    \"total_money\": 0.01,\n" +
                    "    \"trade_state\": \"0\",\n" +
                    "    \"transaction_id\": \"2017050821001004710233242734\",\n" +
                    "    \"payorderInfo\": {\n" +
                    "      \"body\": \"买家支付宝账号:[xia***@126.com] 2017-05-08 14:13:11\",\n" +
                    "      \"channel\": 0,\n" +
                    "      \"creattime\": \"2017-05-08 14:12:20\",\n" +
                    "      \"dismoney\": 0,\n" +
                    "      \"id\": 42732,\n" +
                    "      \"invoiceAmount\": 0.01,\n" +
                    "      \"isZFT\": 0,\n" +
                    "      \"isdown\": 0,\n" +
                    "      \"mcid\": 1,\n" +
                    "      \"mdiscount\": \"0.0\",\n" +
                    "      \"oldorderid\": \"2017041400005\",\n" +
                    "      \"orderid\": \"000012017041400005000056346\",\n" +
                    "      \"orderpayid\": \"2017050821001004710233242734\",\n" +
                    "      \"orderpaystate\": 0,\n" +
                    "      \"ordfrom\": 0,\n" +
                    "      \"ordmoney\": 0.01,\n" +
                    "      \"ordno\": \"201705080108000056346\",\n" +
                    "      \"paytypeid\": 8,\n" +
                    "      \"payurl\": \"https://qr.alipay.com/bax098232ebnahzao3mh60be\",\n" +
                    "      \"pointAmount\": 0,\n" +
                    "      \"tablenum\": \"\",\n" +
                    "      \"timeEnd\": \"2017-05-08 14:13:02\",\n" +
                    "      \"udStateUrl\": \"\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"errorCode\": \"200\"\n" +
                    "}";
        }else{
            str= "{\n" +
                    "  \"errorText\": \"成功\",\n" +
                    "  \"returnCode\": 1,\n" +
                    "  \"data\": {\n" +
                    "    \"attach\": \"xia***@126.com\",\n" +
                    "    \"mdiscount\": \"0.0\",\n" +
                    "    \"ret_code\": 0,\n" +
                    "    \"ret_msg\": \"\",\n" +
                    "    \"time_end\": \"2017-05-08 14:13:02\",\n" +
                    "    \"total_money\": 0.01,\n" +
                    "    \"trade_state\": \"0\",\n" +
                    "    \"transaction_id\": \"2017050821001004710233242734\",\n" +
                    "    \"payorderInfo\": {\n" +
                    "      \"body\": \"买家支付宝账号:[xia***@126.com] 2017-05-08 14:13:11\",\n" +
                    "      \"channel\": 0,\n" +
                    "      \"creattime\": \"2017-05-08 14:12:20\",\n" +
                    "      \"dismoney\": 0,\n" +
                    "      \"id\": 42732,\n" +
                    "      \"invoiceAmount\": 0.01,\n" +
                    "      \"isZFT\": 0,\n" +
                    "      \"isdown\": 0,\n" +
                    "      \"mcid\": 1,\n" +
                    "      \"mdiscount\": \"0.0\",\n" +
                    "      \"oldorderid\": \"2017041400005\",\n" +
                    "      \"orderid\": \"000012017041400005000056346\",\n" +
                    "      \"orderpayid\": \"2017050821001004710233242734\",\n" +
                    "      \"orderpaystate\": 0,\n" +
                    "      \"ordfrom\": 0,\n" +
                    "      \"ordmoney\": 0.01,\n" +
                    "      \"ordno\": \"201705080108000056346\",\n" +
                    "      \"paytypeid\": 8,\n" +
                    "      \"payurl\": \"https://qr.alipay.com/bax098232ebnahzao3mh60be\",\n" +
                    "      \"pointAmount\": 0,\n" +
                    "      \"tablenum\": \"\",\n" +
                    "      \"timeEnd\": \"2017-05-08 14:13:02\",\n" +
                    "      \"udStateUrl\": \"\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"errorCode\": \"200\"\n" +
                    "}";
        }
        try {
            writer.write(AESUtils.getAesStr(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
