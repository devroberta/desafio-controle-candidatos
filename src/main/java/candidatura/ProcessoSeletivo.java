package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    selecaoCandidatos();
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
