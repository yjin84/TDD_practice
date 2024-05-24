package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarTest {

  @Test
  public void testMultiplication() {
    Dollar dollar = new Dollar(5);
    dollar.times(2);
    assertEquals(10, dollar.amount);
  }
}
