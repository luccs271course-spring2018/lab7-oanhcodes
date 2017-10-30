package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.Scanner;

public class ReverseLines {

  private static LinkedStack<String> inputStack = new LinkedStack<>();

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // Done recursively read and print successive input lines until EOF, then print them out in
    String line = input.nextLine();
    if (line.isEmpty()) {
      for (String s : inputStack.asList()) {
        System.out.println(s);
      }
      return;
    }
    inputStack.push(line);
    System.out.println(inputStack.peek());
    printReverse(input);
  }
}