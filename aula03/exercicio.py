class Restaurante:
  def __init__(self, nome, avaliacao):
    self.nome = nome
    self.avaliacao = avaliacao
    self.cardapio = []

  def get_nome(self):
    print("Nome " + self.nome)

  def adicionar_item(self, item):
    self.cardapio.append(item)

  def imprimir_menu(self):
    for item in self.cardapio:
        print(item.nome + " : " + item.preco)

class Item:
  def __init__(self, nome, preco):
    self.nome = nome
    self.preco = preco

  def get_nome(self):
    print("Nome: " + self.nome)


restaurantes = []

while True:
    print("\nMenu Principal:")
    print("1. Cadastrar restaurante")
    print("2. Listar restaurantes")
    print("3. Cadastrar item no menu de um restaurante")
    print("4. Sair")
    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        nome_restaurante = input("Digite o nome do restaurante: ")
        avaliacao = input("Digite a avaliacao do restaurante: ")
        restaurante = Restaurante(nome_restaurante, avaliacao)
        restaurantes.append(restaurante)
        print("Restaurante" + nome_restaurante + "cadastrado com sucesso!")
    elif opcao == "2":
        print("Restaurantes cadastrados:")
        for idx, restaurante in enumerate(restaurantes):
            print(str(idx) + ":" + restaurante.nome)
            restaurante.imprimir_menu()
    elif opcao == "3":
        escolha = int(input("Escolha o número do restaurante para adicionar um item ao menu: "))
        restaurante_escolhido = restaurantes[escolha]
        nome_item = input("Digite o nome do item: ")
        preco_item = input("Digite o preco do item: ")
        item = Item(nome_item, preco_item)
        restaurante_escolhido.adicionar_item(item)
        print(f"Item {nome_item} adicionado ao menu do restaurante {restaurante_escolhido.nome}!")
    elif opcao == "4":
        print("Obrigado por utilizar o sistema de cadastro de restaurantes!")
        break
    else:
        print("Opção inválida. Por favor, escolha uma opção válida.")
