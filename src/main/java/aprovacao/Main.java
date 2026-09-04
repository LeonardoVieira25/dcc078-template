package aprovacao;

import imc.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("M", 70.0f, 1.75f);
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
