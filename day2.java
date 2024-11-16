package test1;

import java.util.*;


class day2 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> num = new ArrayList<>();
        
        
        for(int i = 0; i <arr.length; i++){
            if(arr[i] % divisor == 0){
                num.add(arr[i]);
            }

        }
        if(num.isEmpty())
            return new int[]{-1};

        
        int [] answer = new int[num.size()]; 
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }





        return answer;
    }
    
    public static void main(String[] agrs) {
    	
    	Scanner scan = new Scanner(System.in);
    	day2 sol = new day2();
    	
    	System.out.println("배열의 크기를 입력하시오.");
    	int size = scan.nextInt();
    	
    	int[] arr = new int[size];   
    	
    	System.out.println("배열값을 입력하시오.");
    	for(int i = 0; i < arr.length; i++) {
    		int num = scan.nextInt();
    		arr[i] = num;
    	}
    	
    	System.out.println("나누는 숫자를 입력하시오.");
    	int divisor = scan.nextInt();
    	
    	int[] sum = new int[size];
    	
    	sum = sol.solution(arr, divisor);
    	System.out.print("나눠지는 값은: ");
    	for(int i = 0; i < sum.length; i++) {
    		System.out.println(sum[i] + ",");
    	}
    	
    }
}

