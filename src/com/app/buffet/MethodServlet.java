package com.app.buffet;

import com.app.buffet.bean.data.MethodBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.MethodResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MethodServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<MethodResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        MethodResponse bean = new MethodResponse();

        bean.setMethodList(new ArrayList<>());
        for (Object[] items:Contents.METHODS) {
            MethodBean cb = new MethodBean();
            cb.setItemId((Long) items[0]);
            cb.setId((Long) items[1]);
            cb.setName((String) items[2]);
            cb.setMakeFee(ObjectFormatter.getDouble(items[3]));
            cb.setFeeType((int) items[4]);
            cb.setSequence((int) items[5]);
            bean.getMethodList().add(cb);
        }

        BuffetResponse<MethodResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
