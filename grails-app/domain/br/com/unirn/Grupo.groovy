package br.com.unirn

class Grupo {

	String descricao
	
	static hasMany = [agendas:Agenda]
	
	static constraints = {
		descricao()
		agendas()
	}
	
	static mapping = {
	}
	
	String toString(){
		descricao
	}
	
}
