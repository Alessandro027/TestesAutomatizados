#language: pt
#enconding: UTF-8

@cadastrarUsuario
Funcionalidade: Cadastrar usuario

 @cadastro
 Cenario: usuario invalido
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employee name "Fiona Grace"
	E informar no campo username "Jooão"
	E informar no campo password "Al123456"
	E informar no campo confirmar password "Al123456"
	E acionar o botao salvar
	Então o sistema cadastra o usuario "Jooão"
	



