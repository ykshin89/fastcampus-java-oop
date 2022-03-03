package com.fastcampus.javaoop.logic;


import java.util.ArrayList;
import java.util.List;

// 문자열, 숫자 정렬
// 서로비교하기
// 제네릭 타입을 사용하는데 비교하는 클래스 Comparable (String, Integer)
public class BubbleSort <T extends Comparable<T>>{

    public List<T> sort(List<T> list) {

        // 입력한 메모리를 구분 시켜놓음.
        // 입력관 출력을 구분시켜줘서 
        // 출력이 변해도 입력에 변화가 되지 않도록 처리
       List<T> output = new ArrayList<>(list);

       // 일반적인 버블솔트
        // 서로 다른 두수가 정렬되어 나가는것
        // 오름차순
        for (int i = output.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(output.get(j).compareTo(output.get(j + 1)) > 0){ //앞뒤를 비교하여 앞에거보다 크면 바꿔라(스왑) 뒤로갈수록 숫자가 커짐
                    T temp = output.get(j);
                    output.set(j, output.get(j+1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }

}
