import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----BANKOMAT----");

        Scanner scanner = new Scanner(System.in);
        boolean Continue = true;

        int konto = 0;
        while (Continue) {

            System.out.println("Wybierz operacje: \n1.STAN KONTA\n2.WPŁATA\n3.WYPŁATA\n4.KONIEC");
            int decision = scanner.nextInt();


            if (decision == 1){
                System.out.println("Stan konta " + konto + " zł.");
            }


            else if (decision == 2){
                System.out.println("Ile chcesz wpłacić pieniędzy?");
                int wplata = scanner.nextInt();

                    if (wplata >= 0 ){
                        konto += wplata;
                        System.out.println("Wpłaciłeś " + (wplata) + " zł.");
                    } else {
                        System.out.println("Wprowadz prawidłowe dane");
                     }
            }

            else if (decision == 3){
                System.out.println("Ile chcesz wypłacić pieniędzy?");
                int wyplata = scanner.nextInt();
                    if (wyplata>=0 && konto>=wyplata){
                        konto -= wyplata;
                        System.out.println("Wypłaciłeś " + (wyplata) + " zł.");
                    } else if (wyplata<0) {
                        System.out.println("Wprowadź prawidłowe dane!");
                    } else if(konto<wyplata){
                        System.out.println("Brak środków na koncie!");
                    }
            }

            else if (decision == 4){
                Continue = false;
            } else {
                System.out.println("Nie ma takiej operacji");
            }



        }
    }
}