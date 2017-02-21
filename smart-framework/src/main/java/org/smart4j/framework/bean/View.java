package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dengjj on 2017/2/21.
 */
public class View {
    private String path;

    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<String, Object>();
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
