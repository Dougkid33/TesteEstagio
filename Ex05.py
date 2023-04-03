
string_original = "Douglas Augusto Marcelino Silva"

string_invertida = []

for i in range(len(string_original)-1, -1, -1):
    string_invertida.append(string_original[i])

nova_string = ''.join(string_invertida)

print(nova_string)
