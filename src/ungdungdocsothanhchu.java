import java.util.Scanner;

public class ungdungdocsothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn đọc số nhở hơn 20? Nếu không hãy Enter ");
        int num = sc.nextInt();
        if (num < 10){
            switch (num) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");

                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }else if (num < 20) {
            switch (num) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eightteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
        }else if (num <100){
             new CountLesshundreds().number();

        }

    }

}
