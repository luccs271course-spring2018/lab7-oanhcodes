package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  private static LinkedStack<String> inputStack = new LinkedStack<>();

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  public static void fillStack(String inputString) {
    inputStack.push(inputString);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
  }
}
