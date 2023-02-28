package cn.chinaclear.sh.apps.demo.cicd;

import java.util.Arrays;
import java.util.Stack;

public class NumberSum {

  Calculator calcer = new Calculator();

  public int sumCalc(int[] numbers) {
    Stack<Integer> numstack = new Stack<Integer>();
    numstack.addAll(Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)));
    // exception when numstack is empty
    int res = numstack.pop();
    int temp;
    try {
      while (!numstack.empty()) {
        temp = numstack.pop();
        res = calcer.calc(res, temp, '+');
      }
    } catch (Exception e) {
      System.out.println("calculation failed");
    }
    return res;
  }
}
