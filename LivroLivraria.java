public class LivroLivraria extends Livro {

    double preco;
    String novoUsado;
    String localPrateleira;
    String categoria;

    // métodos
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNovoUsado(){
        return this.novoUsado;
    }

    public void setNovoUsado(String novoUsado){
        this.novoUsado = novoUsado;
    }

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


    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}