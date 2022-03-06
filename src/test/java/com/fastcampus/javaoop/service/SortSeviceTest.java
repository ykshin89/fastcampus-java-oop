package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortSeviceTest {

    // 기존에는 메인 자체에서 항상 변경해줘야되는데 지금은 사용하는 곳에서 바꿔주는
    // 이 방식이 의존성 방식 디펜던시 인젝션이라 한다.
    // 구현체를 주입해서 사용한다.
    private SortSevice sut = new SortSevice(new JavaSort<String>());

    @Test
    void test(){
        //

        //When
        List<String> actual  = sut.doSort(List.of("3","2","1"));

        //Then
        assertEquals(List.of("1","2","3"),actual);
    }

}