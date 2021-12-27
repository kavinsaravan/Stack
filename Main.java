class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push('A');
    stack.push('C');
    stack.pop();
    stack.push('X');
    stack.push('X');
    stack.push('P');
    stack.push('D');

    stack.print();
    System.out.println();
    System.out.println("Stack size: " + stack.size());
    System.out.println();
    String s = stack.toString();
    System.out.println("The stack: " + s);

    stack.empty();
    System.out.println("Stack after emptying: " + stack.size());
    stack.print();
  }
}