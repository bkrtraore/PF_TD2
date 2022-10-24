package appli.exo2;

public class Main {
    public static void main(String[] args){
        Paire<Integer, Double> myPaire = new Paire<>(180, 180.);

        System.out.println(myPaire.ao.test(myPaire));

    }
}
