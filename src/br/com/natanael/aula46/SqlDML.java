package br.com.natanael.aula46;

public interface SqlDML {

	void select(String query);
	void insert(String query);
	void update(String query);
	void delete(String query);
	
}
