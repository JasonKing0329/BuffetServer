package com.app.buffet;

import com.app.buffet.bean.data.ItemClassBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.ItemClassResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ItemClassServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<ItemClassResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        ItemClassResponse bean = new ItemClassResponse();

        bean.setItemClassList(new ArrayList<>());
        for (Object[] items:Contents.ITEM_CLASS) {
            ItemClassBean cb = new ItemClassBean();
            cb.setId((long) items[0]);
            cb.setName((String) items[1]);
            cb.setSequence((int) items[2]);
            cb.setImgurl((String) items[3]);
            bean.getItemClassList().add(cb);
        }

        BuffetResponse<ItemClassResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
