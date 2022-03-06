package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

public class SortSevice {

    private final Sort<String> sort;

    // 생성자 주입방식( 필드에 필요한 부분만 )
    public SortSevice(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {

        Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
