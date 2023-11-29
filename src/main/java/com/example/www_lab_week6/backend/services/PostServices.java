package com.example.www_lab_week6.backend.services;

import com.example.www_lab_week6.backend.repositories.PostRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PostServices {
    private PostRepository postRepository;
}
