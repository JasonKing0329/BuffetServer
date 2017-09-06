package com.app.buffet;

import com.app.buffet.bean.data.MethodBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BasicDataResponse;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.MethodResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class BasicDataServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<BasicDataResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        BasicDataResponse bean = new BasicDataResponse();

        bean.setAddress("华苑产业园区榕苑路6号");
        bean.setDevCode("1001");
        bean.setVersion("165");
        bean.setType(1);
        bean.setPayUrl("http://o2oapi.com");
        bean.setId("5812");
        bean.setTel("13333333333");
        bean.setName("测试门店");

        BuffetResponse<BasicDataResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
