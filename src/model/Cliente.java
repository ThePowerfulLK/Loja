package model;

import java.util.Objects;

public class Cliente {

    private int cod;
    private String nome;
    private String numero;

    public Cliente(){}

    public Cliente(int cod) {
        this.cod = cod;
    }

    public Cliente(int cod, String nome, String numero) {
        this.cod = cod;
        this.nome = nome;
        this.numero = numero;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod=" + cod + ", nome=" + nome + ", numero=" + numero + '}';
    }
    
   
    
    
    

    
}
