package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
	   /** Forma de inicializar vari�vel
	   */ 
		String nome = "Tiago";
		System.out.println(nome);
		/** outra forma  de inicializar vari�vel
		 */
		nome="tiago";
		System.out.println("nome: " + nome);
		int idade = 51;  /** vari�vel tipo inteira*/
		char sexo ='M';  /** vari�vel aceita um caractere*/
		double Temperatura = 26.5; /**  numeros fracionado*/
		boolean arcondicionado = false;
		System.out.println("Saiba dessas coisas abaixo: ");
		System.out.println("idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatua: " + Temperatura);
		System.out.println("Ar condicionado: " + arcondicionado);
		System.out.println("____________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores aritm�ticos e atribi��es");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5  | i = "+ (i + 5)); 
		System.out.println("i = " + i + " - 5  | i = "+ (i - 5));
		System.out.println("i = " + i + " * 5  | i = "+ (i * 5));
		System.out.println("i = " + i + " / 5  | i = "+ (i / 5));
		System.out.println("i = " + i + " % 5  | i = "+ (i % 5));
		System.out.println("i +=      | i = " + (i += 5));
		System.out.println("i -=      | i = " + (i -= 5));
		System.out.println("i *=      | i = " + (i *= 5));
		System.out.println("i /=      | i = " + (i /= 5));
		i++;
		System.out.println("i++       | i = " + i);
		i--;
		System.out.println("i--       | i = " + i);
	} 

}
