package com.tch.boot.bootwork1.service;

import com.tch.boot.bootwork1.dao.ArticleRepository;
import com.tch.boot.bootwork1.po.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @ClassName:ArticleService
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/3/23
 */
@Service
public class ArticleService {

    @Qualifier("articleRepository")
    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> qryDataByPage(int pageNo,int pageSize){
        Pageable pageable =  PageRequest.of(pageNo,pageSize,Sort.Direction.ASC,"id");
        Page<Article> all = articleRepository.findAll(pageable);
        return all;
    }


}