public class Exercises {
    private static int primeNum;

    public static void main(String[] args) {
        // // Exercise 01
        // int grade = 9;

        // if (grade >= 7) {
        // System.out.println("You passed!");
        // } else {
        // System.out.println("You failed");
        // }

        // // Exercise 02
        // int num1 = 50, num2 = 9, num3 = 4;
        // if (num1 < num2 && num1 < num3 && num2 < num3) {
        // System.out.printf("%d, %d, %d", num1, num2, num3);
        // } else if (num1 < num2 && num1 < num3 && num3 < num2) {
        // System.out.printf("%d, %d, %d", num1, num3, num2);
        // } else if (num2 < num1 && num2 < num3 && num1 < num3) {
        // System.out.printf("%d, %d, %d", num2, num1, num3);
        // } else if (num2 < num1 && num2 < num3 && num3 < num1) {
        // System.out.printf("%d, %d, %d", num2, num3, num1);
        // } else if (num3 < num1 && num3 < num2 && num1 < num2) {
        // System.out.printf("%d, %d, %d", num3, num1, num2);
        // } else {
        // System.out.printf("%d, %d, %d \n", num3, num2, num1);
        // }

        // // Exercise 03
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i * 9);
        // }

        // // Exercise 04
        // for (int i = 0; i < 6; i++) {
        // // String asterisk = "*";
        // // System.out.println(asterisk.concat(asterisk.repeat(i)));
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // // Exercise 05
        // int i, j, k, n;
        // n = 5;
        // for (i = 1; i < n + (n / 2); i++) {
        // for (j = n + (n / 2); j > i; j--) {
        // System.out.print(" ");
        // }
        // for (k = 1; k <= 2 * i - 1; k++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // // Exercise 06
        // int a = 0, b = 1, c = 0;
        // n = 10;

        // for (i = 0; i < n; i++) {
        // c = a + b;
        // a = b;
        // b = c;
        // }
        // System.out.println(b);

        // // Exercise 07
        // int counter = 2;
        // boolean prime = true;
        // n = 2;

        // while ((prime) && (counter != n)) {
        // if (n % counter == 0)
        // prime = false;
        // counter++;
        // }
        // System.out.println(prime);

        // // Exercise 08
        // int result = 0;
        // for (int multiplier = 2, x = 2; x <= 4568 && result <= 4568; x++) {
        // result = x * multiplier;
        // System.out.println(result);
        // }

        // // Exercise 09
        // int factorial = 5, total = 1;
        // for (i = 1; i <= factorial; i++) {
        // total *= i;
        // }
        // System.out.println(total);

        // // Exercise 10
        // float fact = 1, res = 1;
        // for (i = 1; i <= 5; i++) {
        // fact *= i;
        // res += 1 / fact;
        // }

        // System.out.println("e = " + res);

        // // Exercise 11
        // int array[] = new int[100];

        // // Exercise 12
        // for (i = 0; i < array.length; i++) {
        // array[i] = (int) (Math.random() * 100);
        // System.out.println(array[i]);
        // }

        // // Exercise 13
        // int greater = array[0];
        // for (i = 0; i < array.length; i++) {
        // if (array[i] >= greater) {
        // greater = array[i];
        // }
        // }
        // System.out.println("Greater value: " + greater);

        // // Exercise 14
        // int lower = array[0];
        // for (i = 0; i < array.length; i++) {
        // if (array[i] <= lower) {
        // lower = array[i];
        // }
        // }
        // System.out.println("Lower value: " + lower);

        // // Exercise 15
        // for (i = 0; i < array.length; i++) {
        // int div = 2;
        // while(array[i] % div != 0){
        // div++;
        // }
        // if(div == array[i]){
        // System.out.println("Prime num: " + array[i]);
        // }
        // }

        // // Exercise 16
        // for (int number : array) {
        // if(number % 2 == 0){
        // System.out.println("Even num: " + number);
        // }
        // }

        // // Exercise 17 (Bubble sort)
        // for(i = 0; i < array.length; i++){
        // for(j = 0; j < array.length - i - 1; j++){
        // if(array[j] < array[j + 1]){
        // int temp = array[j];
        // array[j] = array[j+1];
        // array[j+1] = temp;
        // }
        // }
        // System.out.print(array[j] + ", ");
        // }

        // // Exercise 18
        // float totalSum = 0f;
        // for (int num : array) {
        // totalSum += (float)num;
        // }
        // float mean = totalSum / array.length;
        // System.out.println("\nMean: " + mean);

        // // Exercise 19
        // System.out.println("Sum: " + (array[0] + array[array.length - 1]));

        // // Exercise 20
        // for (int num : array) {
        // if(num == 90){
        // System.out.println("There's a 90!");
        // }
        // }

        // Exercise 21
        int matrix[][] = new int[5][5];

        // Exercise 22
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println("");
        }

        // Exercise 23
        float totalSum = 0;
        float matrixLenght = matrix.length * matrix[0].length;
        for (int[] row : matrix) {
            for (int col : row) {
                totalSum += col;
            }
        }
        float mean = totalSum / matrixLenght;
        System.out.println("Matrix mean: " + mean);

        // Exercise 24
        int greater = matrix[0][0];
        int counter = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                if (col >= greater) {
                    greater = col;
                }
            }
        }

        for (int[] row : matrix) {
            for (int col : row) {
                if (col == greater) {
                    counter++;
                }
            }
        }

        System.out.println("Greater num: " + greater + "\nRepeated: " + counter);

        // Exercise 25
        for (int[] row : matrix) {
            for (int col : row) {
                int div = 2;
                while (col % div != 0) {
                    div++;
                }
                if (div == col) {
                    System.out.println("Prime num: " + col);
                }
            }
        }

        // Exercise 26
        for (int[] row : matrix) {
            for (int col : row) {
                if (col % 2 == 0) {
                    System.out.println("Even numbers: " + col);
                }
            }
        }

        // Exercise 27
        int mainSum = 0, secondarySum = 0;
        int mainDiagonal[] = new int[matrix.length];
        int secondDiagonal[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiagonal[i] = matrix[i][j];
                }
                if ((i + j) == (matrix.length - 1)) {
                    secondDiagonal[i] = matrix[i][j];
                }
            }
        }
        for (int num : mainDiagonal) {
            mainSum += num;
        }
        for (int num : secondDiagonal) {
            secondarySum += num;
        }

        System.out.printf("Main Diagonal Sum: %d \nSecondary Diagonal Sum: %d\n", mainSum, secondarySum);

        // Exercise 28
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[matrix.length - 1][i];
        }
        System.out.printf("Total Sum: %d", total);

        // Exercise 29
        int rowSum = 0, colSum = 0, count = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if(isEqual(rowSum, colSum)){
                count++;
                if(count == matrix.length){
                    System.out.println("Is a magic square!");
                }
                else{
                    rowSum = 0;
                    colSum = 0;
                }
            }
            else{
                System.out.println("\nIs not a magic square :(");
                return;
            }
        }
    }
    private static boolean isEqual(int rowSum, int colSum){
        return rowSum == colSum;
    }
}
