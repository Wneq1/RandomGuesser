import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("Zgadnij wygenerowana liczbe z zakresu od 0 - 100");
    int liczba = rand.nextInt(101);
    while(true){
 
    System.out.println(liczba);
    int wprowadzona_liczba = scan.nextInt();

    if(liczba == wprowadzona_liczba){
   System.out.println("Brawo wygrales");
      return;
}
    else {
       System.out.println("Odpowiedz nieporpawna sprobuj jeszcze raz!!");
     }

    }
  }
}