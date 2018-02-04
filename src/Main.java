
	import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę");

                int liczba = scanner.nextInt();

                if(liczba % 2 == 0)

                    System.out.println("Podaj drugą liczbę");
                else System.out.println("Podana liczba nie jest liczbą parzystą");
                if(liczba % 2 == 0);
                else return;


                Scanner scanner1 = new Scanner(System.in);


                int liczba1 = scanner1.nextInt();

                if(liczba1 % 2 == 0)

                    System.out.println("Podaj trzecią liczbę");
                else System.out.println("Podana liczba nie jest liczbą parzystą");
                if(liczba % 2 == 0);
                else return;

                Scanner scanner2 = new Scanner(System.in);

                int liczba2 = scanner2.nextInt();

                if(liczba2 % 2 ==0);
                else System.out.println("Podana liczba nie jest liczbą parzystą");
                if(liczba2 % 2 == 0);
                else return;

                int suma = (liczba + liczba1 + liczba2);

                if(suma % 2 ==0)

                    System.out.println("Suma wynosi " + suma + " i jest to liczba parzysta ");


        }
        }
