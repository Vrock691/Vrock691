package fr.vamary.blog.controllers;

import fr.vamary.blog.dto.ArticleRequestDTO;
import fr.vamary.blog.dto.ArticleResponseDTO;
import fr.vamary.blog.entities.Article;
import fr.vamary.blog.services.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("")
    public ResponseEntity<Page<ArticleResponseDTO>> getAllArticles(Pageable pageable) {
        return ResponseEntity.ok(articleService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleResponseDTO> getArticleById(@PathVariable int id) {
        return ResponseEntity.ok(articleService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ArticleResponseDTO> createPost(@Valid @RequestBody ArticleRequestDTO request) {
        ArticleResponseDTO created = articleService.createArticle(request);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(location).body(created);
    }

}
