package fr.vamary.blog.services;

import fr.vamary.blog.dto.ArticleResponseDTO;
import fr.vamary.blog.entities.Article;
import fr.vamary.blog.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

    public Article findById(int id) {
        return articleRepository.findById(id);
    }

    public Article newArticle(Article article) {
        return articleRepository.create(article);
    }

    public Page<ArticleResponseDTO> getAll() {
        return articleRepository.getAll();
    }
}
