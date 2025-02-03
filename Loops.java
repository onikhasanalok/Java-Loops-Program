import java.util.Scanner;
import java.util.*;

import java.util.Scanner;

class Loops{

public static void main(String[] args) {

    //Print 1 to 10 by for loop
for (int i=1; i<10; i++){

    System.out.println(i);
}


//Print Hello World! 10 times

for (int i=1; i<=10; i++){

    System.out.println(i+") Hello World!");

}


Scanner Sc4 = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = Sc4.nextInt();
int sum =0;
for (int i = 1; i<=n; i++){
   sum = sum +i;
}
System.out.println("Result of the SUM: "+sum);


Scanner Sc5 = new Scanner(System.in);
System.out.print("Enter a Value: ");
int x = Sc5.nextInt();

for (int i= 1; i<=10; i++){

    int table = i*x;
    System.out.println(x+" * "+i+" = "+table);

}


}

}