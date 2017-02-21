package org.smart4j.framework.bean;

import java.util.Map;

/**
 * Created by dengjj on 2017/2/21.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return paramMap.get(name) == null ? 0 : Long.valueOf(paramMap.get(name).toString());
    }

    public Map<String, Object> getParamMap() {
        return paramMap;
    }
}
