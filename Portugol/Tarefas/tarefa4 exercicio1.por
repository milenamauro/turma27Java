programa
{
	
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
	de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	*/
	funcao inicio()
	{
		inteiro pontuacao [5], maiorPontuacao = 0, x = 0

		para(x=0;x<=4;x++){
			escreva("Digite os pontos da atividade: ")
			leia(pontuacao[x])
			se(pontuacao[x]>maiorPontuacao){
				maiorPontuacao = pontuacao[x]
			}
		}
			escreva("A maior pontuação é: ", maiorPontuacao)
	
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */