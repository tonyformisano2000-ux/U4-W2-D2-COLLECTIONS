import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class es2 {
    List<Integer> arrayBase=new ArrayList<Integer>();
List <Integer> invertita=new ArrayList<Integer>();
List <Integer> paroDisparo=new ArrayList<Integer>();
    Scanner scanner=new Scanner(System.in);

//    2.1
public static void generaLista(){
    Random random= new Random();
    boolean isGood=false;
    System.out.println("inserisci un numero da 1 a 100");

    int numero=0;
    while (isGood==false){
    int numeroo= scanner.nextInt();
    if(numeroo<0 && numeroo<100){
        System.out.println("HO DETTO DA 1 A 100! ");
    }else{isGood=true;
    numero=numeroo;}
    }
    for(int i=0; i<numero; i++){
arrayBase.add(random.nextInt(101));
    }
    System.out.println(arrayBase);
}

//2.2
public static void invertiLista ( List invertimi) {
    for(int i=invertimi.size();i==0;i--){
        invertita.add((Integer) invertimi.get(i));
    }
    }

//    2.3
public static void paroDisparo (List ingresso, boolean selezione){

    if (selezione==true){
        for (int i=0; i<ingresso.size(); i=i+2 ){
            paroDisparo.add((Integer) ingresso.get(i));
        }}
        else{
        for (int i=1; i<ingresso.size(); i=i+2 ){
            paroDisparo.add((Integer) ingresso.get(i));
        }
        }
    System.out.println(paroDisparo);
    }


    public static void methodCaller(){
    generaLista();
    invertiLista(arrayBase);
    System.out.println("scrivi 1 per selezionare i dispari e 2 per i pari");
    int choice=scanner.nextInt();
    if(choice==1){paroDisparo(invertita, false);}
else if(choice==2){paroDisparo(invertita, true);}
else{
        System.out.println("input non valido ");
    }}
}


