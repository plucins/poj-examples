package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.addAll(Arrays.asList(5,1,23,5,2,1,1));

        System.out.println(numbers);

        List<List<Integer>> twoDimArray = new ArrayList<>();
        twoDimArray.add(new ArrayList<>());
        System.out.println(twoDimArray.get(0).size());

//        for(int i = 0; i < numbers.size(); i++){
//            if(numbers.get(i) % 2 == 0){
//                System.out.println(numbers.get(i));
//            }
//        }
//
//        for(Integer number: numbers){
//            System.out.println(number);
//        }


    }
}
