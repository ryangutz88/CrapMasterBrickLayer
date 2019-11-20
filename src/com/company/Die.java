package com.company;

public class Die {
    private int x;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
    public Die(){
        int x=0;
    }

    public void roll(){
        x = (int) (Math.random()*6+1);
    }

    public int getNumDots(){
        return x;
    }
}
