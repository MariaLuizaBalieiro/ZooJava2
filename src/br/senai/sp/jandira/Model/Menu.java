package br.senai.sp.jandira.Model;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alojamento alojamento = new Alojamento();
        Visitantes visitante = new Visitantes();
        Saude saude = new Saude();

        while (true) {
            System.out.println("1. Adicionar animal");
            System.out.println("2. Consultar animais");
            System.out.println("3. Adicionar histórico médico");
            System.out.println("4. Adicionar data de revisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sexo (M/F): ");
                    char sexo = scanner.nextLine().charAt(0);
                    System.out.print("Identificação única: ");
                    String identificacaoUnica = scanner.nextLine();

                    System.out.print("Espécie (Mamifero/Reptil/Ave): ");
                    String especie = scanner.nextLine();

                    Animal animal;
                    if (especie.equalsIgnoreCase("Mamifero")) {
                        animal = new Mamifero(nome, idade, sexo, identificacaoUnica);
                    } else if (especie.equalsIgnoreCase("Reptil")) {
                        animal = new Reptil(nome, idade, sexo, identificacaoUnica);
                    } else if (especie.equalsIgnoreCase("Ave")) {
                        animal = new Ave(nome, idade, sexo, identificacaoUnica);
                    } else {
                        System.out.println("Espécie inválida!");
                        continue;
                    }

                    alojamento.adicionarAnimal(animal);
                    break;
                case 2:
                    visitante.consultarAnimais(alojamento);
                    break;
                case 3:
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = scanner.nextLine();
                    System.out.print("Histórico médico: ");
                    String historico = scanner.nextLine();
                    saude.adicionarHistoricoMedico(animal.get(nomeAnimal), historico);
                    break;
                case 4:
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = scanner.nextLine();
                    System.out.print("Data da última revisão: ");
                    String dataRevisao = scanner.nextLine();
                    saude.adicionarDataUltimaRevisao(Animal.get(nomeAnimal), dataRevisao);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

class Mamifero extends Animal {
    public Mamifero(String nome, int idade, char sexo, String identificacaoUnica) {
        super(nome, idade, sexo, identificacaoUnica);
    }
}

class Reptil extends Animal {
    public Reptil(String nome, int idade, char sexo, String identificacaoUnica) {
        super(nome, idade, sexo, identificacaoUnica);
    }
}

class Ave extends Animal {
    public Ave(String nome, int idade, char sexo, String identificacaoUnica) {
        super(nome, idade, sexo, identificacaoUnica);
    }
}




