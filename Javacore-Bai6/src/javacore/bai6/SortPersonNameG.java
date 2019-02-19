/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bai6;

import java.util.Comparator;

/**
 *
 * @author Anonymous
 */
public class SortPersonNameG implements Comparator<Person>{

    @Override
    public int compare(Person t, Person t1) {
        return t1.getName().compareTo(t.getName());
    }
    
}

