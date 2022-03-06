package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // main 코드를 건드리지 않고 구현체를 변경할수있음
        // 객체지향설계 부분인데 (SOLID)
        // DIP : 프로그래머는 "추상화에 의존해야지, 구체화에 의존하면 안된다."

        // 현재로는 test에서도 어떤 것을 실행테스트 하는지도 모르고 구현체 변경을 위해 main자체를 바꿔야한다
        // 이런 상태를 main클래스가 버블솔트에 간결합되어 있다고 할수있다.
        // 간결합이란 : main은 정렬을 하기위해서 어떻게 해야되는지 구체적으로 알고있는 상태 버블소트를 알고있음
        // 이부분을 인터페이스로 변경한다면 어떤 정렬기능을 써야되는 로직을 아는데 구체적으로 그 로직이 어떤것지는 몰라도되는
        // 결합을 느슨하게 만들수있다.
        //BubbleSort<String> sort = new BubbleSort<>();   // 구현체(1)

        Sort<String> sort = new BubbleSort<>();   // 구현체(2) - 아직도 main 
        // Sort

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
