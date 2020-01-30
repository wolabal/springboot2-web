package com.wolabal.boot.spring.doamin.posts;


import com.wolabal.boot.spring.domain.posts.PostRepository;
import com.wolabal.boot.spring.domain.posts.Posts;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @After
    public void cleanUp(){
        postRepository.deleteAll();
    }

    @Test
    public void 게시판글_저장_불러오기(){
        // given
        String title ="게시글 제목 ";
        String content = "게시글 내용 ";

        postRepository.save(Posts.builder()
                                .title(title)
                                .content(content)
                                .author("sungjun@me.com").build());

        // when
        List<Posts> postsList = postRepository.findAll();


        // then
        Posts firstRow = postsList.get(0);
        assertThat(firstRow.getTitle()).isEqualTo(title);
        assertThat(firstRow.getContent()).isEqualTo(content);
    }
}
