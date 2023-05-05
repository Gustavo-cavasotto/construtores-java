// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Equipe equipe1 = new Equipe("Gremio", 0, 0, 0);
            equipe1.registrarVitoria(1);
            var dados = equipe1.mostrarEstatisticas(equipe1);
            System.out.println(dados);
            System.out.println(equipe1.getNome());
        };
    }
