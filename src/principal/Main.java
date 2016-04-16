/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    
    public static void percorrerLista(ListIterator<Aluno> i) {
        while (i.hasPrevious()) {
            Aluno aluno = i.previous();
            System.out.println(aluno.getNome());
        }      
    }
    
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("JOAO", 'M'));
        lista.add(new Aluno("MARIA", 'F'));
        lista.add(new Aluno("ZECA", 'M'));
        lista.add(new Aluno("JOANA", 'F'));
        lista.add(new Aluno("HUGUINHO", 'M'));
        lista.add(new Aluno("ZEZINHO", 'M'));
        lista.add(new Aluno("LUIZINHO", 'M'));
        IteratorPrevious i = new IteratorPrevious(lista, 'M');
        System.out.println("");
        percorrerLista(i);
    }
}
