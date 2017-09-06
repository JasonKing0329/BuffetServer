package com.app.buffet;

import com.app.buffet.bean.data.GetPosResponse;
import com.app.buffet.bean.data.PosBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.DocVersionBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class GetPosServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<GetPosResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {
        GetPosResponse bean = new GetPosResponse();
        bean.setPosList(new ArrayList<>());
        bean.getPosList().add(new PosBean());
        bean.getPosList().add(new PosBean());
        bean.getPosList().add(new PosBean());
        bean.getPosList().get(0).setId(1001);
        bean.getPosList().get(0).setName("POS1");
        bean.getPosList().get(0).setCode("A1");
        bean.getPosList().get(1).setId(1002);
        bean.getPosList().get(1).setName("POS2");
        bean.getPosList().get(1).setCode("A2");
        bean.getPosList().get(2).setId(1003);
        bean.getPosList().get(2).setName("POS3");
        bean.getPosList().get(2).setCode("A3");

        BuffetResponse<GetPosResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
