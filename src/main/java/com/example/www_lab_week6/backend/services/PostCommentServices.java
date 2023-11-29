package com.example.www_lab_week6.backend.services;

import com.example.www_lab_week6.backend.repositories.PostCommentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentServices {
    private PostCommentRepository postCommentRepository;
}
