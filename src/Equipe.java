public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Equipe(String nome, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String mostrarEstatisticas(Equipe equipe){
        return "Mostrando dados da equipe:" + "\nNome: " + equipe.nome + "\nVitorias: " + equipe.vitorias + "\nDerrotas: " + equipe.derrotas + "\nEmpates: " + equipe.empates;
    }



    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return "O nome da equipe é: " + nome;
    }

    public int registrarVitoria(int number){
        return vitorias = vitorias + number;
    }
    public int registrarDerrota(int number){
        return derrotas = derrotas + number;
    }
    public int registrarEmpate(int number){
        return empates = empates + number;
    }



}
