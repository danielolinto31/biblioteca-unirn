package br.com.unirn

import grails.transaction.Transactional

@Transactional
class AgendaService {

    def buscarDadosPorNome(nome) {
		Agenda.findAllByNomeIlike("%${nome}%")
    }
}
