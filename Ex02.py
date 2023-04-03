#Ex 02r
i = 0
fibonacci = 1
numero = int(input("Escreva o numero desejado: "))
while fibonacci < numero:
    i,fibonacci = fibonacci, i + fibonacci

if fibonacci == numero:
    print(f"O numero {numero} informado faz parte da sequencia fibonacci")
else:
    print(f"O numero {numero} não  faz parte da sequencia .")
