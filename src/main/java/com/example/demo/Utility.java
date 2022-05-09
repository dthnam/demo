package com.example.demo;

public final class Utility {
  private Utility() {}

  public static int calc(int first, int second, Operator operator) throws Exception {
    switch (operator) {
      case ADD:
        return first + second;
      case MINUS:
        return first - second;
      case MULTIPLY:
        return first * second;
      default:
        if (second == 0)
          throw new IllegalArgumentException("Divide by 0 is not allowed");
        return first / second;
    }
  }
}
