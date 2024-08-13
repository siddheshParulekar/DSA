package org.example.recursion;

public class ReduxeToZero {
    int step = 0;

    public int numberOfSteps(int num) {

        if (num == 0)
            return step;

        if (num %2 == 0){
            num = num/2;
            step = step+ 1;
           return numberOfSteps(num);
        } else {
            num = num-1;
            step = step+ 1;
           return numberOfSteps(num);
        }

    }

    public static void main(String[] args) {
        ReduxeToZero reduxeToZero =new ReduxeToZero();
        System.out.println(reduxeToZero.numberOfSteps(14));
    }
}
