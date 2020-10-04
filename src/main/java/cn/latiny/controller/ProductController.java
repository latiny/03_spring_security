package cn.latiny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 11:09
 * @since 1.0.0
 **/
@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        return "商品添加";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String query() {
        return "商品查询";
    }
}
