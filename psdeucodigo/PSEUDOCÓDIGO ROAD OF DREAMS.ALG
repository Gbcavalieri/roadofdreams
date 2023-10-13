Algoritmo "PSEUDOCÓDIGO ROAD OF DREAMS"




Var
   Cliente, cpfCliente, nomeDestino: caractere
   precoDestino: real
   Clientes, cpfClientes, nomeDestinos: vetor[1..100] de caractere
   precoDestinos: vetor[1..100] de real
   i, opcao, qtdClientes, qtdDestinos: inteiro

Inicio
   qtdClientes <- 0


   repita
      escreval("---------- MENU ----------")
      escreval("   DIGITE UMA OPÇÃO:   ")
      escreval(" 1. CADASTRO CLIENTE   ")
      escreval(" 2. CADASTRO DESTINO   ")
      escreval(" 3. CONSULTAR CLIENTE  ")
      escreval(" 4. CONSULTAR DESTINO  ")
      escreval(" 5. SAIR               ")
      escreval("---  ROAD OF DREAMS  ---")
      escreval("")



      leia (opcao)
      escolha opcao
      caso 1
            escreval("insira o nome completo do cliente:")
            leia(Cliente)
            escreval("Insira o CPF do cliente:")
            leia(cpfCliente)

            qtdClientes <- qtdClientes + 1

            Clientes[qtdClientes] <- Cliente
            cpfClientes[qtdClientes] <- cpfCliente

            escreval("Cliente cadastrado!")
            escreval("")
      caso 2
            escreval("Informe o nome do destino:")
            leia(nomeDestino)
            escreval("Informe o valor do destino:")
            leia(precoDestino)

            qtdDestinos <- qtdDestinos + 1

            nomeDestinos[qtdDestinos] <- nomeDestino
            precoDestinos[qtdDestinos] <- precoDestino

            escreval("Cadastro do destino realizado!")
            escreval("")
      caso 3
         se qtdClientes = 0 entao
            escreval("Não há clientes cadastrados!")
         senao
            escreval("---------- Tabela de Clientes ----------")
            para i de 1 ate qtdClientes faca
                escreval("Nome: ", Clientes[i])
                escreval("CPF: ", cpfClientes[i])
                escreval("-------------------------------")
            fimpara
            escreval("-------------------------------")
         fimse
         escreval("")
      caso 4
         se qtdDestinos = 0 entao
            escreval("Não há destinos cadastrados!")
         senao
            escreval("----- Tabela de Destinos -----")
            para i de 1 ate qtdDestinos faca
                escreval("Nome: ", nomeDestinos[i])
                escreval("Preco: ", precoDestinos[i])
                escreval("-------------------------------")
            fimpara
            escreval("-------------------------------")
         fimse
         escreval("")
      caso 5
         escreval("Programa finalizado")
         interrompa
      outrocaso
         Escreva("Opção inválida")
      fimescolha
   ate opcao = 5


Fimalgoritmo