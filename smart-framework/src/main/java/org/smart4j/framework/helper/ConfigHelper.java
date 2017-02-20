package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropertiesUtil;

import java.util.Properties;

/**
 * Created by dengjj on 2017/2/20.
 */
public class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropertiesUtil.loadProperties(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver(){
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    public static String getJdbcUrl() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUsername() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassword() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAppJspPath() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    public static String getAppAssetPath() {
        return PropertiesUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH, "/asset/");
    }

}
