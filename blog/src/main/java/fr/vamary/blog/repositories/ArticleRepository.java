package fr.vamary.blog.repositories;

import fr.vamary.blog.dto.ArticleResponseDTO;
import fr.vamary.blog.entities.Article;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void init() {}

    public Article create(Article article) {
        entityManager.persist(article);
        return article;
    }

    public Article update(Article article) {
        entityManager.merge(article);
        return entityManager.find(Article.class, article);
    }

    public Article findById(int id) {
        return entityManager.find(Article.class, id);
    }

    @PreDestroy
    public void destroy() {}

    public Page<ArticleResponseDTO> getAll() {
        return new PageImpl<>(entityManager.find(Article.class, ""));
    }
}
