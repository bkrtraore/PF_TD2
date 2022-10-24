package appli.exo1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Somme<Integer> ajouteurdEntier = ((a, b) -> a+b);
        System.out.println(ajouteurdEntier.somme(1,2));

        Somme<String> ajouteurdeString = ((a, b) -> a+b);
        System.out.println(ajouteurdeString.somme("1","2"));

        Somme<Double> ajouteurdeDouble = ((a, b) -> a+b);
        System.out.println(ajouteurdeDouble.somme(1.,2.));

        Somme<Long> ajouteurdeLong = ((a, b) -> a+b);
        System.out.println(ajouteurdeLong.somme(1l,2l));

        System.out.println("-------------------------------------");

        ToString<List<String>> string = (t -> {
            String chaine = "";
            for (String s : t
            ) {
                chaine += t.toString();
            }
            return chaine;
        });


    }
}