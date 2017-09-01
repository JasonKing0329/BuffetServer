package com.app.buffet;

import com.app.buffet.bean.data.SetMealGroup;
import com.app.buffet.bean.data.SetMealItem;
import com.app.buffet.bean.request.BaseRequest;
import com.app.buffet.bean.response.BuffetResponse;
import com.app.buffet.bean.response.SetmealResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SetmealServlet extends BaseJsonServlet<BaseRequest, BuffetResponse<SetmealResponse>> {

    @Override
    protected Class<BaseRequest> getRequestClass() {
        return BaseRequest.class;
    }

    @Override
    protected void onReceiveRequest(BaseRequest requestBean, HttpServletResponse resp) throws IOException {

        SetmealResponse bean = new SetmealResponse();

        bean.setSetmealGroup(new ArrayList<>());
        bean.setSetmealItem(new ArrayList<>());
        for (Object[] items:Contents.SETMEAL_GROUPS) {
            SetMealGroup cb = new SetMealGroup();
            cb.setSetmealItemId((Long) items[0]);
            cb.setSetmealGroupId((Long) items[1]);
            cb.setName((String) items[2]);
            cb.setMaxQty((int) items[3]);
            cb.setMinQty((int) items[4]);
            cb.setSequence((int) items[5]);
            bean.getSetmealGroup().add(cb);
        }
        for (Object[] items:Contents.SETMEAL_ITEMS) {
            SetMealItem cb = new SetMealItem();
            cb.setSetmealItemId((Long) items[0]);
            cb.setSetmealGroupId((Long) items[1]);
            cb.setItemId((Long) items[2]);
            cb.setSizeId((Long) items[3]);
            cb.setRequired((int) items[4]);
            cb.setDefaultQty(ObjectFormatter.getDouble(items[5]));
            cb.setAddPrice(ObjectFormatter.getDouble(items[6]));
            cb.setAddPriceByQty((int) items[7]);
            cb.setMaxLimitQty(ObjectFormatter.getDouble(items[8]));
            cb.setSequence((int) items[9]);
            bean.getSetmealItem().add(cb);
        }

        BuffetResponse<SetmealResponse> responseBean = new BuffetResponse<>();
        responseBean.setResult(1);
        responseBean.setErrorCode(200);
        responseBean.setData(bean);
        sendResponse(resp, responseBean);
    }
}
