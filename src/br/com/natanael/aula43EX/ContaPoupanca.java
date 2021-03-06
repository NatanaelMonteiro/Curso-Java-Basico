package br.com.natanael.aula43EX;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public String toString() {
        String s = "ContaPoupanša[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}