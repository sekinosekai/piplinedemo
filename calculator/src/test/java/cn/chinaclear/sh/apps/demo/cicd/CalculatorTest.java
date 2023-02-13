/*
 * @Author: Yuyuan SHI
 * @Date: 2023-02-10
 * @FilePath: /piplinedemo/calculator/src/test/java/cn/chinaclear/sh/apps/demo/cicd/CalculatorTest.java
 * 
 */
package cn.chinaclear.sh.apps.demo.cicd;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void testSubtract() throws Exception {
    assertEquals(-3, calculator.calc(2, 5, '-'));
  }

  @Test
  public void testAdd() throws Exception {
    assertEquals(7, calculator.calc(2, 5, '+'));
  }

  @Test
  public void testMultiply() throws Exception {
    assertEquals(10, calculator.calc(2, 5, '*'));
  }

  @Test
  public void testWrongOperator() {
    assertThrows("", IllegalArgumentException.class, () -> {
      calculator.calc(5, 2, '^');
    });
  }

  @Test
  public void testDivide() throws Exception{
      calculator.calc(1, 0, '/');
  }
}