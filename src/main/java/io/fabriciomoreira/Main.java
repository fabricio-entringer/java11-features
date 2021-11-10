package io.fabriciomoreira;

import io.fabriciomoreira.features.LocalVariableLambda;
import io.fabriciomoreira.features.NewFileMethods;
import io.fabriciomoreira.features.NewStringMethods;

public class Main {
    public static void main(String[] args) {

        new LocalVariableLambda().execute();
        new NewStringMethods().execute();
        try {
            new NewFileMethods().execute();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
