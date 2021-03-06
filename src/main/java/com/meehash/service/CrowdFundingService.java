package com.meehash.service;

import com.meehash.model.Fund;
import com.meehash.model.Record;

import java.util.List;

/**
 * @author niyuelin1990
 */
public interface CrowdFundingService {

    // 获取众筹项目数量
    public int getFundCount() throws Exception;

    // 获取众筹项目信息
    public List<Fund> getFunds(int pageIndex, int pageSize) throws Exception;

    // 获取众筹捐赠记录
    public List<Record> getRecords(int fundIndex) throws Exception;

    // 为自己发起众筹
    public void raiseFund(String desc, int goal);

    // 为别人发送金币
    public void sendCoin(int fundIndex, int coin);
}