algoritmo "2° EXERCÍCIOS DE ALGORITMOS - IF"

var
   qtf, qtc: inteiro
   Nhara: caractere
inicio
      Escreval ("}----------------------------------------{")
      Escreval ("                Ferraduras")
      Escreval ("------------------------------------------")
      
      Escreval ("Qual é o nome do Hara?")
      Escreva  ("- ")
      Leia (Nhara)
      Escreval ("}----------------------------------------{")

      LimpaTela
      
      Escreval ("}----------------------------------------{")
      Escreval ("                 ", Nhara)
      Escreval ("------------------------------------------")
      
      Escreval ("Quantos cavalos resisdem no hara ", Nhara, "?")
      Escreva  ("- ")
      Leia (qtc)
      
      qtf <- 4 * qtc
      
      Escreval ("------------------------------------------")
      Escreval ("A hara ", Nhara, " irá precisar de", qtf, " ferra-")
      Escreval ("duras para os", qtc, " cavalos.")
      Escreval (">----------------------------------------<")
fimalgoritmo
