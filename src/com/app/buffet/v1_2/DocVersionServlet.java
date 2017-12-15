package com.app.buffet.v1_2;

import com.app.buffet.BaseJsonServlet;
import com.app.buffet.bean.data.PromoteImageBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.DocVersionBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class DocVersionServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<DocVersionBean>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {
        DocVersionBean bean = new DocVersionBean();
        bean.setVersion("ds12edwqg");
        bean.setBgCode("123456");
        bean.setPromoteCode("123456");

        bean.setPromoteImageUrl("/img/promote/promote.jpg");

        bean.setPromoteImageUrlList(new ArrayList<>());
        PromoteImageBean pib = new PromoteImageBean();
        pib.setSeq(0);
        pib.setUrl("/img/promote/promote.jpg");
        bean.getPromoteImageUrlList().add(pib);
        pib = new PromoteImageBean();
        pib.setSeq(1);
        pib.setUrl("/img/promote/promote1.jpg");
        bean.getPromoteImageUrlList().add(pib);
        pib = new PromoteImageBean();
        pib.setSeq(2);
        pib.setUrl("/img/promote/promote2.jpg");
        bean.getPromoteImageUrlList().add(pib);

        bean.setBgImageUrl("/img/bg/bg.jpg");
        BuffetResponse<DocVersionBean> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
