/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Eliomar Santana
 */
public class IteratorPrevious implements ListIterator{
    
    public IteratorPrevious(Collection<Aluno> c, char sexo){
        this.sexo = sexo;
        List lista = (List)c;
        this.meuiterator = lista.listIterator(lista.size());
        previous();
    }
    
    private Collection<Aluno> c;
    private char sexo;
    ListIterator<Aluno> meuiterator;
    private Object previousObject = null;


    @Override
    public boolean hasPrevious() {
        return previousObject != null;    
    }

    @Override
    public Object previous() {
        Object returnObject = previousObject;
        previousObject = null;
        while(meuiterator.hasPrevious()) {
            Aluno currentObject = meuiterator.previous();
            if(currentObject.getSexo() == sexo) {
                previousObject = currentObject;
                break;
            }
        }
        return returnObject;
    }

    @Override
    public int nextIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int previousIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
