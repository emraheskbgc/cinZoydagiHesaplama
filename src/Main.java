import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yearOfBirth, remainder;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğum Yılınızı Giriniz = ");
        yearOfBirth=input.nextInt();

        remainder = yearOfBirth %12;

        switch (remainder){
            case 0 :
                System.out.println("Çin Zoydağı Burcunuz = Maymun");
                break;
            case 1 :
                System.out.println("Çin Zoydağı Burcunuz = Horoz");
                break;
            case 2 :
                System.out.println("Çin Zoydağı Burcunuz = Köpek");
                break;
            case 3 :
                System.out.println("Çin Zoydağı Burcunuz = Domuz");
                break;
            case 4 :
                System.out.println("Çin Zoydağı Burcunuz = Fare");
                break;
            case 5 :
                System.out.println("Çin Zoydağı Burcunuz = Öküz");
                break;
            case 6 :
                System.out.println("Çin Zoydağı Burcunuz = Kaplan");
                break;
            case 7 :
                System.out.println("Çin Zoydağı Burcunuz = Tavşan");
                break;
            case 8 :
                System.out.println("Çin Zoydağı Burcunuz = Ejderha");
                break;
            case 9 :
                System.out.println("Çin Zoydağı Burcunuz = Yılan");
                break;
            case 10 :
                System.out.println("Çin Zoydağı Burcunuz = At");
                break;
            case 11 :
                System.out.println("Çin Zoydağı Burcunuz = Koyun");
                break;

        }

    }
}
