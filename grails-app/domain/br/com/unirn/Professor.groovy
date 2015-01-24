package br.com.unirn

class Professor {

	String nome
	String endereco
	String numero
	String complemento
	String email
	Date dataNascimento
	
    static constraints = {
		nome()
		email email:true
		endereco nullable:true
		numero nullable:true
		dataNascimento nullable:true
		complemento nullable:true,widget:'textarea'
		 
    }
}
