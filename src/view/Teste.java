package view;

import util.DataBase;

public class Teste {

    public static void main(String[] args) {
        
        DataBase db = new DataBase();
        
        System.out.println(db.open() ? "Conectou" : "Não conectou");
        
    }
    
}
