package coin.problems;

 public class coins {
 public static void main (String args[]) {

 double  money = 572.75;

double ten = (double) Math.floor (money/10);
money -= ten * 10;

double five = (double) Math.floor(money/5);
money -= five * 5;

double one = (double) Math.floor(money/1);
money -= one * 1;

double tfc = (double) Math.floor(money/0.25);
money -= tfc * 0.25;


System.out.println("10 Peso Bills: " + ten);
System.out.println("5 Peso Coins: " + five);
System.out.println("1 Peso Coin: " + one);
System.out.println("25 Cents Coins: " + tfc);
}
}