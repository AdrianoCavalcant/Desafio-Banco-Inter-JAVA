import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudoInscristos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo =this.conteudoInscristos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscristos.remove(conteudo.get());

        }else {System.err.println("Voçê não está matriculado em nenhum conteúdo!");}
    }

    public double calcularTotalXp(){
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(Conteudo ::calcularXp)
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscristos() {
        return conteudoInscristos;
    }

    public void setConteudoInscristos(Set<Conteudo> conteudoInscristos) {
        this.conteudoInscristos = conteudoInscristos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscristos == null) ? 0 : conteudoInscristos.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscristos == null) {
            if (other.conteudoInscristos != null)
                return false;
        } else if (!conteudoInscristos.equals(other.conteudoInscristos))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    }

    
    
}
