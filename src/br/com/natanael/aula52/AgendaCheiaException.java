package br.com.natanael.aula52;

public class AgendaCheiaException extends Exception{

	    @Override
	    public String getMessage() {
	       return "Agenda j� est� cheia";
	    }
}
