public class Java8Tester2 {

  public static void main(String args[]) {
    Java8Tester2 tester = new Java8Tester2();

    GreetingMessage greetingMessage = (message) ->
      System.out.println("Hello : " + message);

    greetingMessage.sayMessage("Tun Lin Aung");

    MathOperation addOperation = (int a, int b) -> a + b;
    MathOperation subOperation = (a, b) -> a -b;
    MathOperation mulOperation = (int a, int b) -> {return a * b;};
    MathOperation divOperation = (a, b) -> a / b;

    System.out.println("Add 5, 2 : " + tester.operation(5, 2, addOperation));
    System.out.println("Subtract 5, 2 : " + tester.operation(5, 2, subOperation));
    System.out.println("Multiply 5, 2 : " + tester.operation(5, 2, mulOperation));
    System.out.println("Divide 5, 2 : " + tester.operation(5, 2, divOperation));
  }

  interface MathOperation {
    int doOperation(int a, int b);
  }

  interface GreetingMessage {
    void sayMessage(String message);
  }

  private int operation(int a, int b, MathOperation operation) {
    return operation.doOperation(a, b);
  }

} 
