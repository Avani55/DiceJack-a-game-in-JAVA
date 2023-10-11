import java.util.Scanner;

public class DiceJack {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /**
     * task -1;
     * take take three number from user.
     * task-2 
     * get three random number by computer.
     */
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("Enter three numbers between 1 to 6: ");
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    int number3 = scan.nextInt();

    System.out.println(" The three number's given by computer: ");
    System.out.print(rollDice());
    System.out.print(" " + rollDice());
    System.out.print(" " + rollDice());

    int sumOfNumber = number1+ number2 + number3;
    int sumOfDiceRolls = (roll1 + roll2 + roll3);
     
    /** task-6
     * call the functions.
     * check the conditions using if statements 
     * which satisfy the given three conditions of the functions.
     * if userWon condtion is true print:" \n Congratulations You won the match ".
     * else print: one of greaterthanSix or lessThanSix is true print:"invalid"
     * else print:"better luck next time".
     */

    if(userWon(sumOfNumber, sumOfDiceRolls)){
      System.out.println(" \n Congratulations You won the match ");
    }
    else if(greaterThanSix(number1, number2, number3)||lessThanSix(number1, number2, number3)){
      System.out.println("invalid ");
    }
    else{
      System.out.println("better luck next time ");
    }
  scan.close();
  }


  public static boolean greaterThanSix(int number1, int number2, int number3) {
    return (number1 > 6 || number2 > 6 || number3 > 6);
  }
   /** task-3:
    * create a function lessthansix
    condition all the arguments should be less than 1 and one of them should satisy true.
    * @param number1
    * @param number2
    * @param number3
    * @return boolean 
    */
  public static boolean lessThanSix(int number1, int number2, int number3) {
    return ((number1 < 1 || number2 < 1 || number3 < 1));
  }

  /** task -5
   * create a function name userWon
   * inside function: 
   * condition 1: Sum of the numbers should be greater than the sum of the dice rolled
   * condition 2: the difference of the two is less than 5.
   * @return parameters (boolean ,  boolean)
   */
  
  public static boolean userWon(int sumOfNumber, int sumOfDiceRolls){
    return (sumOfNumber> sumOfDiceRolls && ((sumOfNumber- sumOfDiceRolls)<5));
  }

  /**
   * task -4
   * create a function which gives three random numbers
   * hint: use built in functions
   * @return (integer)
   */

  public static int rollDice() {
    int choice = (int) (Math.random() * 6) + 1;
    return choice;
  }
}

