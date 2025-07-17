public class LivroBiblioteca extends Livro {

    private String localPrateleira;
    private String categoria;
    private int prazo;
    private String nomeLocatario;

    // métodos
    public String getLocalPrateleira(){
        return this.localPrateleira;
    }

    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira = localPrateleira;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public int getPrazo(){
        return this.prazo;
    }

    public void setPrazo(int prazo){
        this.prazo = prazo;
    }

    public String getNomeLocatario(){
        return this.nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario){
        this.nomeLocatario = nomeLocatario;
    }


    public void Alugar(){
        System.out.println("Estou alugando...");
    }
    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }
}