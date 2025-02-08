package processo;

/**
 *
 * @author Carlos Eduardo dos Santos Figueiredo
 * @version 1.0
 *          https://github.com/carloseduardonit
 *          https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 */
public class Candidatura {

    double salarioBase = 2000;
    static Candidatura QA = new Candidatura();

    public static void main(String[] args) {
        Candidato us1 = new Candidato("João", 2000);
        Candidato us2 = new Candidato("Jose", 1900.00);
        Candidato us3 = new Candidato("Carlos", 3000);
        Candidato[] Qas = new Candidato[5];
        Qas[0] = us1;
        Qas[1] = us2;
        Qas[2] = us3;

        QA.verificarStatusCandidatos(Qas);
        Candidato[] selecionados = QA.selecionarCandidatos(Qas);
        QA.imprimirCandidatosSelecionados(selecionados);
        QA.entraContatoCandidato(selecionados);

    }

    public void entraContatoCandidato(Candidato[] selecionados) {
        int contador = 0;
        do {
            for (Candidato candidato : selecionados) {
               if(candidato == null){
                   contador++;
                   continue;
               }
               if(candidato.isElegivel()){
                   contador++;
                           
               }
            }
        } while (contador < selecionados.length);
    }

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
