package br.com.unirn

class Aluno {

	String nome
	String matricula
	Date dataNascimento
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		nome()
		matricula()
		dataNascimento nullable:true 
    }
}
