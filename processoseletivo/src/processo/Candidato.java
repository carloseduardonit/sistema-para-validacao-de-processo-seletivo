package processo;

/**
 * @author Carlos Eduardo dos Santos Figueiredo
 * @version 1.0 
 * @link https://github.com/carloseduardonit
 * @link https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 */
public class Candidato {

    private String nome;
    private char sexo;
    private char[] telefone = new char[11];
    private int tentativa = 0;
    private double pretensaoSalario = 0;
    private boolean elegivel;

    /**
     * Construtor da classe Candidato
     */
    public Candidato() {
    }

    /**
     * Construtor da classe Candidato 
     * @param nome
     * @param pretensaoSalario
     */
    public Candidato(String nome, double pretensaoSalario) {
        setNome(nome);
        setPretensaoSalario(pretensaoSalario);
        notElegivel();
    }

    /**
     * Setar o nome do candidato
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setar a pretensão salarial do candidato
     * @param pretensaoSalario
     */
    public void setPretensaoSalario(double pretensaoSalario) {
        this.pretensaoSalario = pretensaoSalario;
    }

    /**
     * Obter o nome do candidato
     * @return nome
     */
    public String getNome() {
        if (this.nome != null) {
            return this.nome;
        }
        return "";
    }

    /**
     * Obter a pretensão salarial do candidato
     * @return pretensaoSalario
     */
    public double getPretensaoSalario() {
        return pretensaoSalario;
    }

    /**
     * Verificar se o candidato é elegível
     * @return elegivel
     */
    public boolean isElegivel() {
        return elegivel;
    }

    /**
     * Setar o candidato como elegível
     */
    public void Elegivel() {
        setElegivel(true);
    }

    /**
     * Setar o candidato como não elegível
     */
    public void notElegivel() {
        setElegivel(false);
    }

    /**
     * Setar o candidato como elegível ou não elegível
     * @param elegivel
     */
    private void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    /**
     * Obter o sexo do candidato
     * @return sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Setar o sexo do candidato como masculino(M) ou feminino(F)
     * @param sexo
     */
    public void setSexo(char sexo) {
        do {
            if (sexo == 'M' || sexo == 'F') {
                break;
            }
            System.err.println("SEXO INVÁLIDO");
        } while (true);
        this.sexo = sexo;
    }

    /**
     * Obter o telefone do candidato
     * @return telefone
     */
    public char[] getTelefone() {
        return telefone;
    }

    /**
     * Setar o telefone do candidato com 10 ou 11 dígitos
     * @param telefone
     */
    public void setTelefone(char[] telefone) {
        do {
            if (telefone.length == 11 || telefone.length == 10) {
                break;
            }
            System.err.println("TELEFONE INVÁLIDO");
        } while (true);
        this.telefone = telefone;
    }

    /**
     * Obter a quantidade de tentativas de contato com o candidato
     * @return tentativa
     */
    public int getTentativa() {
        return tentativa;
    }

    /**
     * Incrementar a quantidade de tentativas de contato com o candidato
     */
    public void setTentativa() {
        this.tentativa += 1;
    }

    /**
     * Setar a quantidade de tentativas de contato com o candidato
     * @param tentativa
     */
    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

}
