package cn.chinaclear.sh.apps.demo.cicd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberSumTest {

  NumberSum summer;

  @Before
  public void setUp() {
    summer = new NumberSum();
  }

  @Test
  public void testSumCalc() {
    int[] nums = {1, 2, 3, 5, 8};
    assertEquals(19, summer.sumCalc(nums));
  }
}