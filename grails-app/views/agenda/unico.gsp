<!DOCTYPE html>
<%@page import="br.com.unirn.Grupo"%>
<html>
<head>
<meta name="layout" content="main" />
<title>Welcome to Grails</title>
</head>
<body>
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Agenda Página Única</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<i class="fa fa-clock-o fa-fw"></i>Form Agenda
				</div>
				<div class="panel-body">
					<form id="frmAgenda" role="form">
						<div class="form-group">
							<label for="nome">Nome</label>
							<input type="text" class="form-control" id="nome" name="nome">
						</div>
						<div class="form-group">
							<label for="observacao">Observação</label>
							<textarea class="form-control" id="observacao" name="observacao"></textarea>
						</div>
						<div class="form-group">
							<label for="grupo">Grupo</label>
							<g:select name="grupo.id" id="grupo" from="${Grupo?.list()}" noSelection="${['':'-- Selecione --']}" optionKey="id" class="form-control" />
						</div>
						<input type="submit" value="Enviar" class="btn btn-primary">
					</form>	
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<i class="fa fa-clock-o fa-fw"></i>Agenda Listagem
				</div>
				<div class="panel-body">
					<table class="table table-striped" id="tblAgenda">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Grupo</th>
								<th>&nbsp;</th>
							</tr>
						</thead>
						<tbody>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>