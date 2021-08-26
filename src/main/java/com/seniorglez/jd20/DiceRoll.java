package com.seniorglez.jd20;

import java.util.LinkedList;
import java.util.List;

public class DiceRoll implements Rollable {

    private LinkedList<Rollable> childRolls = new LinkedList();
    
    @Override
    public int[] getResult() {
        int[] result = childRolls.poll().getResult();
        while(!childRolls.isEmpty()) {
            combineChildsResults(result, childRolls.poll().getResult());
        }
        return result;
    }

    private int[] combineChildsResults(int[] a, int[] b) {
        int al = a.length;       
        int bl = b.length;   
        int[] result = new int[al + bl];  
        System.arraycopy(a, 0, result, 0, al);  
        System.arraycopy(b, 0, result, al, bl);
        return result;  
    }
    
}