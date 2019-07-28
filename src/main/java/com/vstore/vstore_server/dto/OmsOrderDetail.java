package com.vstore.vstore_server.dto;

import com.vstore.vstore_server.model.OmsOrder;
import com.vstore.vstore_server.model.OmsOrderItem;
import com.vstore.vstore_server.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by macro on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
