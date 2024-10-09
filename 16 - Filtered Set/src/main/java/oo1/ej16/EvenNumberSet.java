package oo1.ej16;

import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer>{
    @Override
    public boolean add(Integer numero){
        if (numero % 2 == 0){
            return super.add(numero);
        } else {
            return false;
        }
    }
}
