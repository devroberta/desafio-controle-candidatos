package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    imprimirSelecionados();
  }

  static void imprimirSelecionados() {
    String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    for(int indice=0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de n° "+ (indice+1) + " é o " + candidatos[indice]);
    }

    System.out.println("Forma abrevida de interação for each:");

    for(String candidato : candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
    }
  }
  static void selecaoCandidatos() {
    String[] candidatos =
            {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.printf("O candidato %s solicitou este valor de salário %.2f\n", candidato, salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.printf("O candidato %s foi selecionado para a vaga.\n", candidato);
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}
