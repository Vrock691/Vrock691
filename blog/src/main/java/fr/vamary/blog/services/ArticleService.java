package fr.vamary.blog.services;

import fr.vamary.blog.dto.ArticleRequestDTO;
import fr.vamary.blog.dto.ArticleResponseDTO;
import fr.vamary.blog.entities.Article;
import fr.vamary.blog.repositories.ArticleRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    private ArticleResponseDTO toResponse(Article article) {
        return ArticleResponseDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .description(article.getDescription())
                .content(article.getContent())
                .publishDate(article.getPublishDate())
                .modificationDate(article.getModificationDate())
                .build();
    }

    @Transactional
    public Page<ArticleResponseDTO> getAll(Pageable pageable) {
        return articleRepository.findAll(pageable).map(this::toResponse);
    }

    @Transactional
    public ArticleResponseDTO getById(long id) {
        return articleRepository.findById(id).map(this::toResponse).orElse(null);
    }

    @Transactional
    public ArticleResponseDTO createArticle(@Valid ArticleRequestDTO request) {
        Article article = Article.builder()
                .title(request.title())
                .description(request.description())
                .content(request.content())
                .build();
        return toResponse(articleRepository.save(article));
    }
}
