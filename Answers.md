## COMP 271 002 F17 Lab 7 (Week 9)

####  What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?

Each of these methods help us solve problems that have recurring steps. The populateList and populateFifoList methods repeatedly add items to a list. The printReverse method prints each item in a stack. Instead of iterating through a loop, these recursive methods continue by calling itself until the base case is reached.

#### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?

We use arguments in these methods to continually break down the problem into smaller/next steps until the base case is reached. For instance, we want to stop recursive calls when the current node is null for the populateList and populateFifo list methods. In this homework example, the argument gets updated each call to reflect the next node or input value.

#### What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?

populateList is O(n)

populateFifoList is O(n)

ReverseLines.printReverse is O(n)

#### Which of these methods can be implemented using while loops?

All of these methods can be implemented using while loops.