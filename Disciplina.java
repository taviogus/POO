import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void matricularAluno(Aluno aluno) {
        if (alunos.size() < 10) {
            alunos.add(aluno);
        } else {
            System.out.println("Não é possível matricular mais alunos. A disciplina já tem 10 alunos.");
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void mostrarInfoDisciplina() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor);
        listarAlunos();
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void alterarInfoAluno(String matricula, String novoNome) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setNome(novoNome);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Professor: " + professor;
    }

}
