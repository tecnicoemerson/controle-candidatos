package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "EMERSON", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista do candidatos, informando o indice do elemento");
        for(int indice=0;indice< candidatos.length;indice++){
            System.out.println("O candidato de n " + indice + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String []  candidatos = {"FELIPE", "EMERSON", "JULIA", "PAULO", "AUGUSTO","MONICA", "FABRICIO"};

        int candidosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidosSelecionados++;
           }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado do demais candidatos");
        }
    }
}
