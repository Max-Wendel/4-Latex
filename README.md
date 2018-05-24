# 4-Latex
 Sistema de compartilhamento de scripts e Templates referentes a linguagem de texto Latex

# Configurando o ambiente:

## Clonar o projeto
Clone o projeto no repositório do [github](https://github.com/Max-Wendel-UFC/4-Latex.git), ou importe o projeto pelo eclipse (import>git>Projects From Git>Clone URI>(Insira o link do git do projeto)>(Insira seus dados: usuario e senha do github)>Next>Next>Import as General Project>Next>Finish).

---

## Defini-lo como Maven
Depois de ter clonado o projeto para sua pasta local do git, vá no Eclipse e o importe como um projeto Maven (import>Maven>Import Existing Maven Projects>(espere ele identificar o projeto)>(Selecione o projeto 4_Latex)>Finish)

---

## Instalando as dependências
Após ter importado o projeto como Maven siga os seguintes passos:
	1- Vá na pasta do projeto
	2- Clique com o botão direito nela
	3- Vá em 'Run As'
	4- Selecione 'Maven Install'
	5- Agurde ele baixar e instalar as dependências
	6- Pronto!

---

## Verificando Erros
Para verificar se aconteceu algum erro, siga os seguintes passos:
	1- Vá na pasta do projeto
	2- Clique com o botão direito nela
	3- Vá em 'Run As'
	4- Selecione 'Maven Clean'
	5- Aguarde ele fazer a varredura
	6- Pronto!
	
---

## Ajustando a conexão com o banco local
Já com tudo instalado e verificado, vá no seguinte diretório src/main/resource e abra o arquivo 'application.properties' e mude o usuario e senha do postgres de acordo com o usuario e senha do seu servidor postgres.

---

## Agora pode começar
Agora podes por a mão na massa :)