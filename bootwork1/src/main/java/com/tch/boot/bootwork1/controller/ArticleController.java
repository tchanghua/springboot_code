package com.tch.boot.bootwork1.controller;

import com.tch.boot.bootwork1.po.Article;
import com.tch.boot.bootwork1.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:ArticleController
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/3/23
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String qryAll(Model model,@RequestParam(value = "pageNo",defaultValue = "0") int pageNo, @RequestParam(value = "pageSize",defaultValue = "2") int pageSize){
        Page<Article> articles = articleService.qryDataByPage(pageNo, pageSize);
        model.addAttribute("page",articles);
        return "index";
    }
}