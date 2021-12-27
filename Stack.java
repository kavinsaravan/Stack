import java.util.*;

class Stack {
  // fields
  private ArrayList<Character> stackArray = new ArrayList<Character>();
  
  public void push(Character letter) {
    stackArray.add(letter);
  }

  public Character pop() {
    if (stackArray.size() < 1) {
      System.out.print("Stack is empty");
      return (' ');
    } else {
      return stackArray.remove(stackArray.size() - 1);
    }
  }

  public int size() {
    int arraySize = stackArray.size();
    return arraySize;
  }

  public void empty() {
    stackArray.removeAll(stackArray);
  }

  public void print() {
    for (int i = 0; i < stackArray.size(); i++) {
      System.out.print(stackArray.get(i));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < stackArray.size(); i++) {
      sb.append(stackArray.get(i));
    }
    return sb.toString();
  }
}