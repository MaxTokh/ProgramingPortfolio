/**
* The Counter program implements an application that
* displays allows the user to add, subtract, reset, or,
* replace the value stored with a value of the users
* selection.
* @author  Max Tokhtuev
* @version 1.0
* @since   2020-09-30
*/

public class Counter {
  private int value;

  //default constructer
  public Counter() {
    value = 0;
  }

  //second constructor for passsing in an int
  public Counter(int initialValue) {
    value = initialValue;
  }

  //See the total
  public int getValue() {
    return value;
  }
/*
* @param Is used to see what value is stored
* @return int Is the value
*/

  public void click() {
    value += 1;
  //value=++ also works
  }
  /*
  * @param Used to add one to the stored value (represents a click)
  */

  public void click(int amount) {
    value += amount;
  //adds any given amount when placed in ()'s'
  }
  /*
  * @param Used to replace value with whatever amount is desired
  */

  public void reset() {
    value = 0;
  }
  /*
  * @param Used to reset amount stored to zero.
  */

  public void undo() {
    //to undo a click
    value--;
    //value = value - 1;
    //value -= 1;
  }
  /*
  * @param Used to take one away from the count or amount stored.
  */

}
