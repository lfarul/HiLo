
package hilo;

import java.util.Scanner; // dodaję bibliotekę Scanner, która pozwoli zaimportować klasę scanner, która zawiera m.in. klasy nextLine() oraz nextInt().

public class HiLo {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // w tym wierszu tworzymy obiekt Scanner o nazwie scan, który pobiera dane wejściowe z klawiatury komputera: System.in.

        String playAgain = "";
        
        do {
        
            int theNumber = (int) (Math.random() * 20 - 10); /* zakres od (0.0 * 20 - 10) = -10 do (0.99 * 20 - 10) = 19.8 - 10  = 9.8. Czyli zakres od -10 do 9.8. Typ int zaokrągla i daje zakres od
            - 10 do 10.
            generujemy losowo liczbę całkowitą od 1 do 10. Ponieważ funkcja Math.random() generuje liczby w przedziale liczb dziesiętnych od 0.0 do 1.0 (dokładnie to 0.999) 
             należy ten zakres pomnożyc przez 10 aby otrzymać zakres od 0.0 do 10.0 i dodać 1 aby otrzymać zakres od 1.0 do 10.999 
             Instrukcja int jest rzutowaniem typu czyli zamianą liczb dziesiętnych generowanych przez funkcję Math.random() na liczbę całkowitą */

            // System.out.println(theNumber);
            
            int numofTries = 0;

            int guess = 0; // Zmienna guess służy do przechowywania wyboru gracza.

            while (guess != theNumber) { // powtarzaj pętle tak długo jak zmienna guess jest różna od theNumber
                System.out.print("Prosze podaj liczbe w przedziale -10 do 10: ");
                guess = scan.nextInt(); 
                if (guess < theNumber) 
                    System.out.println("Wybrana liczba jest za mała.");
                else if (guess > theNumber) 
                    System.out.println("Wybrana liczba jest za duża.");
                else 
                    System.out.println("BRAWO ! Wybrana liczba jest poprawna.");
                
                numofTries = numofTries + 1;
                
            } // zakończenie pętli while do zgadywania
            System.out.print("Na zgadniecie liczby potrzebowales " + numofTries + " prob.");
            
            System.out.println(" Chcialbys zagrac jeszcze raz (t / n)?");
            playAgain = scan.next(); // pobieranie odpowiedzi tak lub nie uzytkownika
                
            } // ten nawias klamrowy zamyka blok kodu który powtarza grę
        
            while(playAgain.equalsIgnoreCase("t"));
            System.out.println("Dziekuje za gre. Mam nadzieje, ze ci sie podobalo :)");

            scan.close();
            
        } // ten nawias klamrowy zamyka metodę main ()
    } // ten nawias klamrowy zamyka całą klasę HiLo

