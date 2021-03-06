package com.app.buffet;

import com.app.buffet.bean.data.IdBean;
import com.app.buffet.bean.data.ItemClearBean;
import com.app.buffet.bean.data.ItemLimitBean;
import com.app.buffet.bean.request.ItemUpdateRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.ItemUpdateResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ItemUpdateServlet extends BaseJsonServlet<ItemUpdateRequest, BuffetResponse<ItemUpdateResponse>> {

    @Override
    protected Class<ItemUpdateRequest> getRequestClass() {
        return ItemUpdateRequest.class;
    }

    @Override
    protected void onReceiveRequest(ItemUpdateRequest requestBean, HttpServletResponse resp) throws IOException {
        ItemUpdateResponse bean = new ItemUpdateResponse();
        bean.setClearCode("1512");
        if (!requestBean.getClearCode().equals(bean.getClearCode())) {
//            bean.setClearUpdateList(new ArrayList<>());
//            ItemClearBean cb = new ItemClearBean();
//            cb.setId(500001l);
//            cb.setSizeId(-1);
//            bean.getClearUpdateList().add(cb);
//            cb = new ItemClearBean();
//            cb.setId(500002l);
//            cb.setSizeId(-1);
//            bean.getClearUpdateList().add(cb);
//            cb = new ItemClearBean();
//            cb.setId(200001);
//            cb.setSizeId(-1);
//            bean.getClearUpdateList().add(cb);
        }
        bean.setLimitCode("15664");
        if (!requestBean.getLimitCode().equals(bean.getLimitCode())) {
            bean.setLimitUpdateList(new ArrayList<>());
            ItemLimitBean lb = new ItemLimitBean();
            lb.setId(100001);
            lb.setSizeId(-1);
            lb.setLimit(10);
            bean.getLimitUpdateList().add(lb);
            lb = new ItemLimitBean();
            lb.setId(200005);
            lb.setSizeId(2000052);
            lb.setLimit(3);
            bean.getLimitUpdateList().add(lb);
        }
        bean.setImgClassCode("15151");
        if (!requestBean.getImgClassCode().equals(bean.getImgClassCode())) {
            bean.setImgClassUpdateList(new ArrayList<>());
            bean.getImgClassUpdateList().add(new IdBean(3));
        }
        bean.setImgCode("5165");
        if (!requestBean.getImgCode().equals(bean.getImgCode())) {
            bean.setImgUpdateList(new ArrayList<>());
            bean.getImgUpdateList().add(new IdBean(200001));
            bean.getImgUpdateList().add(new IdBean(200002));
            bean.getImgUpdateList().add(new IdBean(300001));
        }

        BuffetResponse<ItemUpdateResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
