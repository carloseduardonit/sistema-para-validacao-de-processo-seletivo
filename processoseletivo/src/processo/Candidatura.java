package processo;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo dos Santos Figueiredo
 * @version 1.0 
 * @link https://github.com/carloseduardonit
 * @link https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 */
public class Candidatura {

    double salarioBase = 2000;
    static Candidatura QA = new Candidatura();
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Candidato us1 = new Candidato("João", 2000);
        Candidato us2 = new Candidato("Jose", 1900.00);
        Candidato us3 = new Candidato("Carlos", 2000);
        Candidato[] Qas = new Candidato[5];
        Qas[0] = us1;
        Qas[1] = us2;
        Qas[2] = us3;

        QA.verificarStatusCandidatos(Qas);
        Candidato[] selecionados = QA.selecionarCandidatos(Qas);
        QA.imprimirCandidatosSelecionados(selecionados);
        QA.entraContatoCandidato(selecionados);

    }

    /**
     * Case 4: Imprimir contato com candidato
     */
    private void imprimirContatoCandidato(Candidato candidato) {
        System.out.println("ENTRAR EM CONTATO COM O CANDIDATO: " + candidato.getNome().toUpperCase() + " ELE ATENDEU? (S/N)");
        char opcao = ler.next().charAt(0);
        switch (opcao) {
            case 'S' -> {
                if (candidato.getTentativa() == 0) {
                    candidato.setTentativa();
                }
                System.out.println("\nLIGAMOS PARA O CANDIDATO: " + candidato.getNome().toUpperCase()
                        + "\nNÓS CONSEGUIMOS CONTATO COM CANDIDATO Após " + candidato.getTentativa() + " TENTATIVA(S)\n");
            }
            case 'N' -> {
                candidato.setTentativa();
                if (candidato.getTentativa() < 4) {
                    System.out.println("O CANDIDATO: " + candidato.getNome().toUpperCase() + " NÃO ATENDEU A LIGAÇÃO");
                    imprimirContatoCandidato(candidato);
                } else {
                    System.out.println("\nNÃO CONSEGUIMOS CONTATO COM O " + candidato.getNome().toUpperCase()+"\n");
                }
            }
            default -> {
                System.out.println("\nOPÇÃO INVÁLIDA\n");
                imprimirContatoCandidato(candidato);
            }
        }
    }

    /**
     * Case 4: Entrar em contato com os candidatos selecionados
     *
     * @param selecionados 
     */
    public void entraContatoCandidato(Candidato[] selecionados) {
        int contador = 0;
        do {
            for (Candidato candidato : selecionados) {
                if (candidato == null) {
                    contador++;
                    continue;
                }
                if (candidato.isElegivel()) {
                    contador++;
                    imprimirContatoCandidato(candidato);
                }
            }
        } while (contador < selecionados.length);
    }

    /**
     * Case 3: Imprimir candidatos selecionados
     *
     * @param selecionados
     */
    public void imprimirCandidatosSelecionados(Candidato[] selecionados) {
        try {
            for (Candidato selecionado : selecionados) {
                System.out.println(
                        "O CANDIDATO " + selecionado.getNome().toUpperCase() + " FOI SELECIONADO PARA ENTREVISTA!!");
            }
        } catch (NullPointerException npe) {
            System.err.println("AINDA HÁ VAGA DISPONIVÉL PARA ESTA POSIÇÃO");
        }

    }

    /**
     * Case 2: Selecionar os candidatos elegíveis para a vaga
     *
     * @param candidatos
     * @return 
     *
     */
    public Candidato[] selecionarCandidatos(Candidato[] candidatos) {
        Candidato[] selecionados = new Candidato[3];
        int contador = 0;
        for (Candidato candidato : candidatos) {
            if (candidato == null) {
                continue;
            }
            if (candidato.isElegivel() && contador < selecionados.length) {
                selecionados[contador++] = candidato;
            }
        }
        return selecionados;
    }

    /**
     * Case 1: Verificar status dos candidatos
     *
     * @param candidatos
     */
    public void verificarStatusCandidatos(Candidato[] candidatos) {
        for (Candidato candidato : candidatos) {
            try {
                System.out.println(QA.analisarCandidato(candidato));
            } catch (NullPointerException npe) {
                System.err.println("NÃO HÁ CANDIDATO ALOCADO PARA ESTA POSIÇÃO");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    /**
     * Case 1: Analisar candidato e verificar se o mesmo é elegível para a vaga
     *
     * @param candidato
     * @return
     */
    public String analisarCandidato(Candidato candidato) throws NullPointerException {
        String nome = candidato.getNome().toUpperCase();
        if (salarioBase > candidato.getPretensaoSalario()) {
            candidato.Elegivel();
            return "LIGAR PARA O CANDIDATO: " + nome;
        } else if (salarioBase == candidato.getPretensaoSalario()) {
            candidato.Elegivel();
            return "LIGAR PARA O CANDIDATO: " + nome + " COM CONTRA PROPOSTA";
        } else {
            candidato.notElegivel();
            return "O CANDIDATO " + nome + " ESTAR AGUARDANDO RESULTADO DEMAIS CANDIDATOS";
        }
    }
}
