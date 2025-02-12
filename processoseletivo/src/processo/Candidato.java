package processo;

/**
 * @author Carlos Eduardo dos Santos Figueiredo
 * @version 1.0 https://github.com/carloseduardonit
 * https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 */
public class Candidato {

    private String nome;
    private char sexo;
    private char[] telefone = new char[11];
    private int tentativa = 0;
    private double pretensaoSalario = 0;
    private boolean elegivel;

    public Candidato() {
    }

    public Candidato(String nome, double pretensaoSalario) {
        setNome(nome);
        setPretensaoSalario(pretensaoSalario);
        notElegivel();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPretensaoSalario(double pretensaoSalario) {
        this.pretensaoSalario = pretensaoSalario;
    }

    public String getNome() {
        if (this.nome != null) {
            return this.nome;
        }
        return "";
    }

    public double getPretensaoSalario() {
        return pretensaoSalario;
    }

    public boolean isElegivel() {
        return elegivel;
    }

    public void Elegivel() {
        setElegivel(true);
    }

    public void notElegivel() {
        setElegivel(false);
    }

    private void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char[] getTelefone() {
        return telefone;
    }

    public void setTelefone(char[] telefone) {
        this.telefone = telefone;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa() {
        this.tentativa += 1;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

}
