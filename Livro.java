public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;

    // métodos
    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public int getNrPaginas(){
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas){
        this.nrPaginas = nrPaginas;
    }

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }


    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    public void Localizar(){
        System.out.println("Estou localizando...");
    }
}