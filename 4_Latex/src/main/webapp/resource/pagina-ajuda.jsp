<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Ajuda</title>
<link rel="stylesheet" href="../css/bootstrap_litera_tema.min.css">	
<link rel="stylesheet" href="../css/estilo-fontes.css">	
</head>
<body id="hpage">

	<c: import url = "cabecalho.jsp" />

	<section>
		<div>
			<div class="jumbotron">
				<h1 class="display-3">4Latex</h1>
				<p class="lead">Que tal começar um novo projeto? :)</p>
				<hr class="my-4">
				

			</div>

			<div class="container">
				<h2>O que é o 4Latex?</h2>
				<p class="texto">
					O <span class="blue">4Latex</span> é um sistema de compartilhamento
					de scripts da linguagem de texto <a
						href="https://pt.wikipedia.org/wiki/LaTeX">Latex</a>. O sistema
					disponibilizará scripts prontos para copiar e colar no seu próprio
					documento de texto Latex, tendo, cada script, uma imagem
					ilustrativa de exemplo, como também um nome (que servirá para
					buscar um determinado script pela barra de pesquisa).
				</p>
				
				<br>
				<h2 id="como_usar">Como utilizar o 4Latex?</h2>
				<p>
					Para começar a utilizar o 4Latex é necessário ter algum editor Latex,
					como <a href="https://sourceforge.net/projects/texstudio/">TeXstudio</a>
					,<a href="http://www.xm1math.net/texmaker/">Texmaker</a> ou o editor online
					<a href="https://pt.sharelatex.com/">ShareLateX</a>, por exemplo. Em seguida,
					basta seguir os passos abaixo:
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">1° Passo</span>
					Instalar, ou usar online, algum editor de texto LateX.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">2° Passo</span>
					Criar, ou abrir, um projeto.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">3° Passo</span>
					Ir na página <a href="pagina-categorias.html#cpage">Categoría</a>, escolher um script e selecionar
					o botão <span class="badge badge-pill badge-primary"> script</span> para pegar seu código.
				</p>
				
				
				<p> 
					<span class="badge badge-pill badge-primary">4° Passo</span>
					Após copiar o código do script desejado, vá até o seu documento (projeto) e cole no lugar que 
					você desejar.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">5° Passo</span>
					Pronto! Agora basta organizar o script no seu documento e criar seu prójeto de maneira mais
					prática e rápida :)
				</p>
				
				<br>
				<h2>Como utilizar um Template?</h2>
				<p>
					Para começar a utilizar os Templates do 4Latex, é recomendado que você saiba 
					<a href="pagina-ajuda.html#como_usar">como utilizar o 4Latex</a>. Após saber como usar, basta
					seguir os passos abaixo:
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">1° Passo</span>
					Criar, ou abrir, um projeto.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">2° Passo</span>
					Ir na página <a href="pagina-templates.html#tppage">Templates</a>,  e escolher um Template.
				</p>
				
				
				<p> 
					<span class="badge badge-pill badge-primary">3° Passo</span>
					Após selecionar o template, veja as imagens ilustrativas de como o mesmo deve ser, e depois
					ver, ao lado das imagens, os arquivos necessários para a utilização do template. Feito isso, basta
					baixar o template.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">4° Passo</span>
					Tendo baixado os arquivos do template, basta descompactá-los e importar em seu projeto.
				</p>
				
				<p> 
					<span class="badge badge-pill badge-primary">5° Passo</span>
					Pronto! agora é só usar seu template!
				</p>
				
				<br>
				<br>
				<blockquote class="blockquote text-center">
  					<p class="mb-0">"O trabalho é a melhor das regularidades e a pior das intermitências"</p>
  					<footer class="blockquote-footer">Victor Marie Hugo.</footer>
				</blockquote>
				<br>
				<br>
				
				<h2>Links úteis</h2>
				<p>
					Introdução ao LaTeX: primeiros passos -> <a href="http://posgraduando.com/introducao-ao-latex-os-primeiros-passos/"> Clique aqui</a>.<br> 
					Introdução ao LaTeX (UFMG) -> <a href="http://www.mat.ufmg.br/~regi/topicos/intlat.pdf"> Clique aqui</a>.<br>
					Editor de texto LaTeX online -> <a href="http://https://pt.sharelatex.com/"> Clique aqui</a>.<br>
				</p>
				
			</div>
		</div>
	</section>

	<footer>
		<c: import url = "rodape.jsp" />
	</footer>
	
</body>
</html>