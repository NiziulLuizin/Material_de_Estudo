algoritmo "5° EXERCÍCIO DE ALGORTIMO - IF"

var
   Npost: caractere
   Pdl, Qp, Qlg: real
inicio
      Escreval ("}--------------------------------------------{")
      Escreval ("                 Gasolina")
      Escreval ("}--------------------------------------------{")

      Escreval ("Qual nome do posto onde irá abastecer?")
      Escreva  ("- ")
      Leia (Npost)
      
      Escreval ("Qual é o preço do litro no posto ", Npost, "?")
      Escreva  ("- ")
      Leia (Pdl)

      Escreval ("Quantos reias deseja colocar de gasosa?")
      Escreva  ("- ")
      Leia (Qp)
      
      Escreval ("----------------------------------------------")
      Escreval ("                   Resultado")
      Escreval ("----------------------------------------------")
      
      Qlg <- Qp / Pdl
      
      Escreval ("Você consiguirá com R$", Qp, " reias colocar no")
      Escreva  ("posto ", Npost)
      Escreval (" ", Qlg:1:1, "L de gasolina.")
      Escreval (">--------------------------------------------<")
fimalgoritmo
