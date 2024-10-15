package com.example.demo.controller;

import com.example.demo.dto.TodoItemDto;
import com.example.demo.service.TodoItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class UserController {

    public UserController() {

    }

    /**
     * User 조회
     */
    @GetMapping("/user")
    public ResponseEntity<?> user() {

        try {
            // 전체 TodoItem 목록 조회
            return ResponseEntity.ok("82107247");
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
