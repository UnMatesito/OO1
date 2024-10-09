package oo1.ej16;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet3 extends AbstractSet<Integer>{
    private Set<Integer> set;

    public EvenNumberSet3(){
        this.set = new HashSet<>();
    }

    public boolean add(Integer numero){
        if (numero % 2 == 0) {
            return set.add(numero);
        } else {
            return false;
        }
    }

    @Override
    public Iterator<Integer> iterator(){
        return set.iterator();
    }

    @Override
    public int size(){
        return set.size();
    }

    @Override
    public boolean contains(Object o){
        return set.contains(o);
    }
}
