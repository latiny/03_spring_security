package cn.latiny.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Latiny
 * @version 1.0
 * @description: MyPasswordEncode
 * @date 2019/9/29 17:42
 */
public class MyPasswordEncode implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
