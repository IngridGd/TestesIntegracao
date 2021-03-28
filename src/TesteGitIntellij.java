public class TesteGitIntellij {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 25;
        int quantidadePessoas = 3;
        boolean acompanhado =quantidadePessoas>=2;

        if (idade >= 18 && acompanhado  ) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce não pode entrar");
        }
    }
}


