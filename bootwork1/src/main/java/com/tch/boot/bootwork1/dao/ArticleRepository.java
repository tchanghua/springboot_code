package com.tch.boot.bootwork1.dao;

import com.tch.boot.bootwork1.po.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @ClassName:ArticleRepository
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/3/23
 */
@Repository("articleRepository")
public interface ArticleRepository extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article> {
}
