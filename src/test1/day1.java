package test1;

import java.util.*;

public class day1 {
    public int[] solution(int []arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int pre = arr[0];
        result.add(pre);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != pre){
                result.add(arr[i]);
                pre = arr[i];
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0;i < answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
        
    }

 public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    day1 sol = new day1();

    int[] arr = new int[1000000];
    int[] result = sol.solution(arr);

    for(int i = 0;i < result.length; i++){
    System.out.println("ddd");
    }






 }
}
