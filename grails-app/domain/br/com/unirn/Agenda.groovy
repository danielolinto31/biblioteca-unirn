package br.com.unirn

class Agenda {

	String nome
	String observacao
	Date dataNascimento
	
	Date dateCreated
	Date lastUpdated
	
	Grupo grupo // relacionado com grupo
	
    static constraints = {
		nome()
		observacao nullable:true, widget:'textarea'
		dataNascimento nullable:true
		grupo nullable:true // relacionado com grupo
    }
	
	static mapping = {
		
	}
}
