import grails.util.GrailsUtil;
import br.com.unirn.Grupo

class BootStrap {

    def init = { servletContext ->
		def devel = GrailsUtil.developmentEnv
		if(devel){
			new Grupo(descricao: "Família").save(failOnError:true)
			new Grupo(descricao: "Amigos").save(failOnError:true)
			new Grupo(descricao: "Inimigos").save(failOnError:true)
			new Grupo(descricao: "Alunos").save(failOnError:true)
		}
    }
    def destroy = {
    }
}
