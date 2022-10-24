package appli.exo2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Paire<T,U>{
    public T fst;
    public U snd;
    public Paire(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }
    @Override public String toString() {
        return String.format("(%s,%s)", fst.toString(), snd.toString());
    }

    Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100;
    Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200;

    Predicate<Paire<Integer, Double>> ti = ttp.or(ttp);
    Predicate<Paire<Integer, Double>> tc = ti.negate();

    Predicate<Paire<Integer, Double>> ptl = p -> p.snd > 150.;
    Predicate<Paire<Integer, Double>> pc = ptl.negate();

    Predicate<Paire<Integer, Double>> ao = tc.and(pc);


}
