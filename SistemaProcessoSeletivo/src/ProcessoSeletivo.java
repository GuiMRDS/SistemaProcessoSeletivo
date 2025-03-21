import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidados = {"GUILHERME", "MARCIA", "JULIA", "PAULO"};
        for (String candidato: candidados) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas < 3);


        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato);
        }
        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
        }



    }

    //Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionado() {
        String [] candidatos = {"GUILHERME", "MARCIA", "JULIA", "PAULO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice de elemento");
        
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abrvida da interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidatos selecionado foi " + candidato);
        }
    }



    static void selecaoCantidados() {
        String [] candidatos = {"GUILHERME", "MARCIA", "JULIA", "PAULO", "ANA", "BRUNO", "AMANDA"};

        int candidatosSelecionados = 0;
        int canditadoAtual = 0;
         double SalarioBase = 2000.0;
        while(candidatosSelecionados < 5 && canditadoAtual < candidatos.length) {
            String candidato = candidatos[canditadoAtual];
            double SalarioPermitido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + SalarioPermitido);
            if(SalarioBase > SalarioPermitido) {
                System.out.println("O candidato " + candidato + " foi selecianado para a vaga");
                candidatosSelecionados++;
            }
            canditadoAtual++;

        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }


    static void analisarCantidado(double SalarioPermitido) {
        double SalarioBase = 2000.0;
        if(SalarioBase > SalarioPermitido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SalarioBase == SalarioPermitido) {
            System.out.println("AGUARDANDO O RESLTADO DOS DEAMIS CONDIDATOS");
        } else {
            System.out.println("AGUARDANDO O RESLTADO DOS DEAMIS CONDIDATOS");
        }
    }
}
