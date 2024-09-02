import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor prof1 = new Professor("Dr. Silva");
        Disciplina disc1 = new Disciplina("Matemática", prof1);

        while (true) {
            System.out.println("|======Bem Vindo!!======|");
            System.out.println("1 - Matricular Aluno");
            System.out.println("2 - Listar alunos por disciplina");
            System.out.println("3 - Mostrar infos da disciplina");
            System.out.println("4 - Listar disciplinas");
            System.out.println("5 - Mostrar informação aluno por matrícula");
            System.out.println("6 - Alterar informação aluno");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha após nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite a matrícula do aluno:");
                    String matricula = scanner.nextLine();
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    Aluno aluno = new Aluno(matricula, nome);
                    disc1.matricularAluno(aluno);
                    break;

                case 2:
                    disc1.listarAlunos();
                    break;

                case 3:
                    disc1.mostrarInfoDisciplina();
                    break;

                case 4:
                    System.out.println(disc1);
                    break;

                case 5:
                    System.out.println("Digite a matrícula do aluno:");
                    String mat = scanner.nextLine();
                    Aluno a = disc1.buscarAlunoPorMatricula(mat);
                    if (a != null) {
                        System.out.println(a);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Digite a matrícula do aluno:");
                    String matriculaAlterar = scanner.nextLine();
                    System.out.println("Digite o novo nome do aluno:");
                    String novoNome = scanner.nextLine();
                    disc1.alterarInfoAluno(matriculaAlterar, novoNome);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
