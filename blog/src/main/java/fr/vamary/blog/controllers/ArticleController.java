package fr.vamary.blog.controllers;

import fr.vamary.blog.dto.ArticleResponseDTO;
import fr.vamary.blog.entities.Article;
import fr.vamary.blog.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("")
    public ResponseEntity<Page<ArticleResponseDTO>> getAllPosts(Pageable pageable) {
        return ResponseEntity.ok(articleService.getAll());
    }

}
