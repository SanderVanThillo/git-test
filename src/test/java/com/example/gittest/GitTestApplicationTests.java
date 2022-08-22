package com.example.gittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GitTestApplicationTests {

    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }

}
