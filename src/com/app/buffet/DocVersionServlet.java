package com.app.buffet;

import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.DocVersionBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DocVersionServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<DocVersionBean>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {
        DocVersionBean bean = new DocVersionBean();
        bean.setVersion("1.1.1");
        bean.setBgCode("123456");
        bean.setPromoteCode("123456");
        bean.setPromoteImageUrl("/img/promote/promote.jpg");
        bean.setBgImageUrl("/img/bg/bg.jpg");
        BuffetResponse<DocVersionBean> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
