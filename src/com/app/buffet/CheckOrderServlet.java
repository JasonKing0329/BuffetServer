package com.app.buffet;

import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckOrderServlet extends BaseJsonServlet<BaseRequest, BuffetResponse> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        BuffetResponse responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        sendResponse(resp, responseBean);
    }
}
