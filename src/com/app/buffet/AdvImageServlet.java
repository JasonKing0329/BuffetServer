package com.app.buffet;

import com.app.buffet.bean.data.AdvImageBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.AdvImageResponse;
import com.app.buffet.bean.response.BuffetResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AdvImageServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<AdvImageResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        AdvImageResponse bean = new AdvImageResponse();

        bean.setCode("123456789");
        bean.setImageList(new ArrayList<>());
        for (Object[] items:Contents.ADV_IMAGES) {
            AdvImageBean cb = new AdvImageBean();
            cb.setId((Long) items[0]);
            cb.setSeq((int) items[1]);
            cb.setUrl((String) items[2]);
            bean.getImageList().add(cb);
        }

        BuffetResponse<AdvImageResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
