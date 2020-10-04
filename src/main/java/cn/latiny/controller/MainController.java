package cn.latiny.controller;

import cn.latiny.encryption.RSAUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 11:15
 * @since 1.0
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        Model model, HttpServletRequest request) {
        if (StringUtils.isEmpty(error)) {
            model.addAttribute("error", error);
        }
        try {
            Map<String, Object> keyPair = RSAUtils.genKeyPair();
            String privateKey = RSAUtils.getPrivateKey(keyPair);
            String publicKey = RSAUtils.getPublicKey(keyPair);
            // TODO 密钥对存入缓存

            model.addAttribute("publickey", publicKey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "login";
    }
}
