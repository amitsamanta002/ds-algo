package comp.science.ds.stack;

import java.util.Stack;

public class CelebratiProblem {

    public static void main(String[] args) {

        int [][] matix = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };
        int n =4;

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
            stack.push(i);
        int count =0;

        while(count < n-1){

            int x = stack.pop();
            int y = stack.pop();

            if(matix[x][y] == 1)
                stack.push(y);
            else
                stack.push(x);

            count++;
        }

        int c = stack.pop();

        for(int k=0;k<n;k++){
            if(matix[c][k] == 1 && c!=k){
                c=-1;
                break;
            }
        }

        System.out.println("Celebrati is = "+c);
    }
}
