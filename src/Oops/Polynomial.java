package Oops;

import java.awt.*;

public class Polynomial {
    int degOfCoefficiants[];
    public Polynomial(){
        degOfCoefficiants = new int[5];
    }

    //set coefficiants
    public void setCoeff (int degree , int coefficiant){
        if(degree>degOfCoefficiants.length-1){
            doubleCapacity();
        }
        this.degOfCoefficiants[degree] = coefficiant;
    }
    private void doubleCapacity (){
        int[] temp = degOfCoefficiants;
        degOfCoefficiants = new int[2*temp.length];
        for(int i = 0 ; i <temp.length ; i++){
            degOfCoefficiants[i] = temp[i];
        }
    }
    //print polynomial
    public void print(){
        System.out.println();
    }
    //add polymnomial
    public Polynomial add (Polynomial p){

    }
    //subtract polynomial
    public Polynomial subtract(Polynomial p){

    }
    //get coefficiant
    public void get(){

    }
    //multiply polynomial

}
