package com.app.buffet;

import com.app.buffet.bean.data.ItemSizeBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.ItemSizeResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ItemSizeServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<ItemSizeResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        ItemSizeResponse bean = new ItemSizeResponse();

        bean.setItemSizeList(new ArrayList<>());
        for (Object[] items:Contents.ITEM_SIZE) {
            ItemSizeBean cb = new ItemSizeBean();
            cb.setItemId((Long) items[0]);
            cb.setId((Long) items[1]);
            cb.setName((String) items[2]);
            cb.setIsDefault((int) items[3]);
            cb.setPrice(ObjectFormatter.getDouble(items[4]));
            cb.setSequence((int) items[5]);
            bean.getItemSizeList().add(cb);
        }

        BuffetResponse<ItemSizeResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
