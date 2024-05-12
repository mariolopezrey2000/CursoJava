package org.example;



public class Main {
    public static void main(String[] args) {
        boolean resultado =false;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int numeroEsperado = 3;

        for (int i= 0;i < numeros.length;i++){
            for (int f = 0;f < numeros.length;f++){
                if(numeros[i]!=numeros[f]){
                   int suma = numeros[i]+numeros[f];
                   if(suma == numeroEsperado){
                       resultado=true;
                   }
                }
            };
        };
        System.out.println(resultado);
    }
}