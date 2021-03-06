package com.tongji.welog.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostDaoTest {

    @Autowired
    PostDao postDao;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() {
        System.out.println(postDao.getPosts(0, 10));
    }

    @Test
    void searchPosts() {
        System.out.println(postDao.searchPosts(0,10 ,"tes"));
    }
}