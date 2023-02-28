package cn.chinaclear.sh.apps.demo.cicd;

public class Calculator {
  public int calc(int num1, int num2, char op) throws Exception {
    int result = 0;
    //
    switch (op) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if(num2 == 0){
          System.out.println("division by 0");
          break;
        }
        result = num1 / num2;
        break;
      default:
        throw new IllegalArgumentException();
    }
    return result;
  }
}

