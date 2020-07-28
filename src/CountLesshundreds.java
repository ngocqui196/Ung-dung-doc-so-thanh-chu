import java.util.Scanner;

public class CountLesshundreds {
    public void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn đang cần tìm số nhỏ hơn 100 sao?");
        System.out.println("Vậy thì bạn hãy nhập số hàng đơn vị nào:");
        int weldingUnit = sc.nextInt();
        System.out.println("Giờ thì hãy nhập số hàng chục!");
        int dozen = sc.nextInt();
        System.out.println("Hàng trăm");
        int hundreds = sc.nextInt();
        String unit = "",dozens = "",hundred = "";

        switch (hundreds) {
            case 1:
                hundred = "One";
                break;
            case 2:
                hundred = "Two";
                break;
            case 3:
                hundred = "Three";
                break;
            case 4:
                hundred = "Four";
                break;
            case 5:
                hundred = "Five";
                break;
            case 6:
                hundred = "Six";
                break;
            case 7:
                hundred = "Seven";
                break;
            case 8:
                hundred = "Eigh";
                break;
            case 9:
                hundred = "Nine";
                break;
        }
        switch (dozen) {
            case 2:
                dozens = "twenty";
                break;
            case 3:
                dozens = "Thirty";
                break;
            case 4:
                dozens = "Forty";
                break;
            case 5:
                dozens = "Fifty";
                break;
            case 6:
                dozens = "Sixty";
                break;
            case 7:
                dozens = "Seventy";
                break;
            case 8:
                dozens = "Eighty";
                break;
            case 9:
                dozens = "Ninety";
                break;
        }
        switch (weldingUnit) {
            case 1:
                unit = "One";
                break;
            case 2:
                unit = "Two";
                break;
            case 3:
                unit = "Three";
                break;
            case 4:
                unit = "Four";
                break;
            case 5:
                unit = "Five";
                break;
            case 6:
                unit = "Six";
                break;
            case 7:
                unit = "Seven";
                break;
            case 8:
                unit = "Eight";
                break;
            case 9:
                unit = "Nine";
                break;
        }
        System.out.printf("Số %d%d%d đọc là: %s hundred %s and %s",hundreds,dozen,weldingUnit,hundred,dozens,unit);
    }
}
