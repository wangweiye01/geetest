package cc.wangweiye.geetest;


import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * GeetestWeb配置文件
 */
public class GeetestConfig {

    // 填入自己的captcha_id和private_key
    private static final String geetest_id = "2e8d0ce42ad8ceca7351ba1ef7ad3958";
    private static final String geetest_key = "1eb1675456155390d91da9d39a1d3c18";
    private static final boolean newfailback = true;

    public static final String getGeetest_id() {
        return geetest_id;
    }

    public static final String getGeetest_key() {
        return geetest_key;
    }

    public static final boolean isnewfailback() {
        return newfailback;
    }

}
