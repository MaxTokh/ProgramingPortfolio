public class counterDemo {
  public static void main(String[] args){
    Counter tally = new Counter();
    Counter custTally = new Counter(69);

      //initial value
    System.out.println("Initial Value: " + tally.getValue());

    tally.reset();

    tally.undo();

    tally.click(70);

    int result = tally.getValue();

    System.out.println("Value: " + tally.getValue());

  }

}
