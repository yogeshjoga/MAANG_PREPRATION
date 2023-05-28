import java.util.ArrayList;
import java.util.List;


/**
 * Genrics Class
 */
class Containers<T,K,L,M,N,O,P,Q>{
    T t;
    K k;
    L l;
    M m;
    N n;
    O o;
    P p;
    Q q;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }

    public O getO() {
        return o;
    }

    public void setO(O o) {
        this.o = o;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

}


public class Genrics1st {

    public static void main(String[] args) {
        int value = 10;

        // collection

        // not type safety
        List values = new ArrayList();
        values.add("hello");
        values.add(1231);
        values.add(12.0000000);

        // type Safety
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8398);
        // it will give you error run-time error
      //  list.add("stgjroefjodfj"); // throws run time error

        /**
         * Handing errors in compile time is better than runtime errors
         * focus into compile time errors
         */


        // started Generics
        Containers cont = new Containers();
        cont.setT("hello this is yogesh");
        System.out.println(cont.getT());

        var hello = "this is yogesh joga darling";

    }
}
