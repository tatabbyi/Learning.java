//while loops
public class learning {
    public static void main(String[] args){
      int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }
        //countdown
        int countdown = 3;

        while (countdown > 0) {
          System.out.println(countdown);
          countdown--;
        }
        System.out.println("Happy New Year!!");

        //print "Yatzy!"If the dice number is 6 ,counts 1 to 6
        int dice = 1;
        
        while (dice <= 6) {
          if (dice <6) {
            System.out.println("No Yatzy!");
          } else {
            System.out.println("Yatzy!");
          }
          dice = dice + 1;
        }
        // for loops structrue; for(initialization;termination;increment){
        //                           Statements(s)
        //                       }
        for (int k = 0; k < 5; k++) {
          System.out.println(k);
        }
        int sum = 0;
        for( int l = 1; l <= 5; l++) {
          sum = sum + l ;
        }
        System.out.println("sum is " + sum);

        //nested loops inner loop executed once for each iteration of outer loop
        for( int m = 1; m <= 2; m++){
        System.out.println("Inner" + m);

          for( int j =1; j <= 3; j++){
          System.out.println("inner" + j);
          }
        }
        for( int p = 1; p <= 3; p++){
        for(int b = 1; b <= 3; b++){
        System.out.println( p * b + " ");
        }
        System.out.println(" ");
      }
      //For-Each loop
      String[] cars = {"volvo", "Bmw", "Ford", "Mazda"};
      for (String y : cars) {
        System.out.println(y);
      }
      //for loop examples
      for (int q = 0; q <= 10; q = q + 2) {
          System.out.println(q);
      }
      int number = 2;


      for (int t = 1; t <= 10; t++) {
          System.out.println(number + " x " + t + " = " + (number * i));
      } 
      //Arrays
      String[] planes = {"airbus", "ejet", "boeing", "private"};
      int[] myNumber = {10, 20, 30, 40};
      System.out.println(planes[0]);
      //prints lenght of array
      System.out.println(planes.lenght);
      //Loop through array elements with the for loop, use lenght property to specify how many times it should run
      String[] cars = {"petronas", "lambo", "ferrari"};
      for (int i = 0; i < cars.lenght; i++) {
        System.out.println(cars[i]);
      }
      //or for each loop, for each string element (called i - as in index) in cars, prints out the value of i
      String[] aniamals = {"cat", "dog", "elephant"};
      for (String i : cars) {
        System.out.println(i);
      }
      //real life example calculates average of different ages
      int ages[] = {20, 22, 34, 35, 47};
      float avg, sum = 0;
      int lenght = ages.lenght;
      for(int age ; ages) {
        sum += age;
      }
      avg =sum/lenght;
      System.out.println("The average age is:" + avg);
        // multidimensional arrays the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:, Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        int[][] myNumbers = {{1, 2, 3, 4,}, {5, 6, 7, 8}};
        System.out.println(MyNumbers[1][2]);//outputs 7
        //Methods
        public class Sub {
          static void myMethod{
            //code to be executed
          }
          //calling method
          public class subsub {
            static void myMethods() {
              System.out.println("I just got executed");
            }
            //calluing it
            public static void subsub(String[] args) {
              myMethods();
            }
          }
          //methods and return values 
          public class Subclass {
            static int myMethodA(int x, int y){
              return x + y;
            }
            public static void subclass(String[] args) {
              int z = myMethodA(5, 3);
              System.out.println(z);
            }
          }
          //Method overloading same name different parameters
          static int plusMethod(int x, int y) {
            return x + y;
          }
          static double plusMethod(double x, double y) {
            return x + y;
          }
          public static void submain(String[] args) {
            int myNum4 = plusMethod(8, 5);
            double myNum5 = plusMethod(4.3, 6.26);
            System.out.println("int: " + myNum4);
            System.out.println("double: " + myNum5);
          }
          //java recursion example add all of the numbers between 5 and 10
          public class subSubMain {
            public static void subSubMain(String[] args) {
              int resultA = sum(5, 10);
              System.out.println(resultA);
            }
            public static int sum(int start, int end) {
              if (end > start) {
                return end + sum(start, end -1);
              } else {
                return end;
              }
            }
          }
        }
      }
    }
}