import java.text.CharacterIterator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class es1 {

    public static void parole(){
//        CHIEDO IL NUMERO DI PAROLE DA INSERIRE

     System.out.println("inserisci un numero di elementi da inserire nell'array:");
     Scanner scanner=new Scanner(System.in);
     int numeroElementi=Integer.parseInt(scanner.nextLine());
//     CREO ARRAY E LO CICLO, NEL CICLO CONFRONTO LE PAROLE INSERITE E STRUTTURO L'ERROR
     Set<String> parole=new HashSet<String>();
     Set<String> paroleRipetute=new HashSet<String >();
     for (int i=0; i<numeroElementi; i++){
         System.out.println("inserire parola:");
         String parola=scanner.nextLine();
         if(parole.contains(parola)){
            paroleRipetute.add(parola);
         } else{parole.add(parola);}
    }
     parole.removeAll(paroleRipetute);
        System.out.println("hai ripetuto più volte queste parole: "+ paroleRipetute);
        System.out.println("hai inserito una sola volta le seguenti parole: "+ parole);
        System.out.println("in totale sono "+ parole.size());
    }

}
