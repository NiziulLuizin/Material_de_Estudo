algoritmo "3° EXERCÍCIO DE ALGORTIMO - IF"

var
   Pfs, Brs: inteiro
   Pdpo, Pdba, PtdBP, P: real
inicio
      Escreval ("}----------------------------------------{")
      Escreval ("                   Hotpão")
      Escreval ("------------------------------------------")
      
      Escreval ("Quantos Pães Fraceses foram vendidos hoje?")
      Escreva  ("- ")
      Leia (Pfs)
      
      Escreval ("Quantos Broas foram vendidas hoje?")
      Escreva  ("- ")
      Leia (Brs)
      
      Pdpo <- 0.12
      Pdba <- 1.50
      
      PtdBP <- (Pdpo * Pfs) + (Pdba * Brs)
      
      P <- PtdBP / 10
      
      Escreval ("------------------------------------------")
      Escreval ("                 Resultado")
      Escreval ("------------------------------------------")
      
      Escreval ("O total arrecadado hoje com a venda dos")
      Escreval ("Pães Franceses e as Broas deram um total")
      Escreval ("de R$", PtdBP:4:2, " Reias.")

      Escreval ("")

      Escreval ("A recomendação é guarda R$", P:4:2, " Reais")
      Escreval ("na poupança.")
      
      Escreval (">----------------------------------------<")
fimalgoritmo
