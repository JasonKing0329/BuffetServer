package com.app.buffet;

import com.app.buffet.bean.data.ItemBean;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.ItemListResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ItemServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<ItemListResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        ItemListResponse bean = new ItemListResponse();

        bean.setItemList(new ArrayList<>());
        for (Object[] items:Contents.ITEMS) {
            ItemBean cb = new ItemBean();
            cb.setId((Long) items[0]);
            cb.setName((String) items[1]);
            cb.setItemClassId((Long) items[2]);
            cb.setUnitName((String) items[3]);
            cb.setPrice(ObjectFormatter.getDouble(items[4]));
            cb.setPriceVip(ObjectFormatter.getDouble(items[5]));
            cb.setSellLimit(ObjectFormatter.getDouble(items[6]));
            cb.setSellOut((int) items[7]);
            cb.setSequence((int) items[8]);
            cb.setSetMealFlg((int) items[9]);
            cb.setEnableSize((int) items[10]);
            cb.setIsMultiSelect((int) items[11]);
            cb.setImgurl((String) items[12]);
            bean.getItemList().add(cb);
        }

        BuffetResponse<ItemListResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }

}
