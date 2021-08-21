package comp.science.ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class PriceSpam {

    public static void main(String[] args) {
        int [] price = {100, 80, 60, 70, 60, 75, 85};
        int [] output = new int[price.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        output[0] = 1;

        for(int i=1; i<price.length;i++){
            while(!stack.isEmpty() && price[i]>=price[stack.peek()])
                stack.pop();

            output[i] = (i - stack.peek());
            stack.push(i);
        }

        Arrays.stream(output).forEach(System.out::println);


    }
}
