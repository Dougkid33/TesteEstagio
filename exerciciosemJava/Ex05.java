package exerciciosemJava;

public class Ex05 {
	public static void main(String[] args) {
       
        String string_original = "Douglas Augusto Marcelino Silva";

        char[] string_invertida = new char[string_original.length()];

     
        for (int i = string_original.length()-1, j = 0; i >= 0; i--, j++) {
            string_invertida[j] = string_original.charAt(i);
        }

        String nova_string = new String(string_invertida);

        System.out.println(nova_string);
	}
}
