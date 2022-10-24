package appli.exo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static <T> List<T> FiltragePredicatif(List<Predicate<T>> ps, List<T> es) {
        Predicate<T> pt = p -> true;
        List<T> liste = new ArrayList<>();

        for (Predicate p : ps){
            pt = pt.and(p);
        }

        for (T t : es){
            if (pt.test(t)) {
                liste.add(t);
            }
        }

        return liste;
    }

    public static void main(String[] args){
        Paire<Integer, Double> myPaire = new Paire<>(180, 180.);

        /*
        myPaire.ao.test(myPaire));
        Predicate pcTest myPaire.pc.test(new Paire<>(180, 50.)));
        myPaire.tc.test(new Paire<>(90, 50.)));*/



    }
}