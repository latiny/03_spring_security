package cn.latiny.security.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 14:41
 * @since 1.0.0
 **/
public class SecurityConstant {

    public static final String LOGIN_PAGE = "/login";

    public static final String LOGIN_OUT = "/logout";

    public static final String LOGIN_OUT_B = "/login?logout";

    public static final String SIGN_IN = "/signIn";

    public static final String STATIC_JS = "/**/*.js";

    public static final String STATIC_CSS =  "/**/*.css";

    public static final String STATIC_JPG = "/**/*.jpg";

    public static final String STATIC_PNG =  "/**/*.png";

    public static final String STATIC_ICO =  "/**/*.ico";

    public static final String[] NO_LIMITS = {
            LOGIN_PAGE, LOGIN_OUT, LOGIN_OUT_B,
            SIGN_IN, STATIC_JS, STATIC_CSS,
            STATIC_JPG, STATIC_PNG, STATIC_ICO
    };
}
