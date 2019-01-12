package com.htn.sofarpc.service.impl;

import com.htn.sofarpc.service.HelloSyncService;

/**
 * @Description: HelloSyncServiceImpl
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/1/12 0012
 * @Version 1.0
 */
public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String string) {
        return string;
    }
}
