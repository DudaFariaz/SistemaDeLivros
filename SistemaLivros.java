public class SistemaLivros {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setCodigo(1);
        livro.setTitulo ("Código da Vinci");
        livro.setEditora("Editora Xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        // Livro biblioteca

        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();
        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo ("Cinderela");
        livrobiblioteca.setAutor("Autor Desconhecido");
        livrobiblioteca.setEditora("Editora 123");
        livrobiblioteca.setNrPaginas(200);
        livrobiblioteca.setEdicao(6);
        livrobiblioteca.setLocalPrateleira("Prateleira AB2");
        livrobiblioteca.setCategoria("Animação");
        livrobiblioteca.setPrazo(10);
        livrobiblioteca.setNomeLocatario("Marcelo Petri");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();

        // Livro livraria

        LivroLivraria livrolivraria = new LivroLivraria();
        livrolivraria.setCodigo(21);
        livrolivraria.setTitulo ("Crepusculo");
        livrolivraria.setAutor("Autor Desconhecido");
        livrolivraria.setEditora("Editora 111");
        livrolivraria.setNrPaginas(2365);
        livrolivraria.setEdicao(10);
        livrolivraria.setLocalPrateleira("Prateleira CB7");
        livrolivraria.setCategoria("Suspense");
        livrolivraria.setPreco(20.00);
        livrolivraria.setNovoUsado("Usado");

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();
    
        System.out.println("  " );
        System.out.println("Codigo do Livro : "+livro.getCodigo());
        System.out.println("Titulo do Livro : "+livro.getTitulo());
        System.out.println("Editora do Livro : "+livro.getEditora());
        System.out.println("Numero de paginas do Livro : "+livro.getNrPaginas());
        System.out.println("Edicao do Livro : "+livro.getEdicao());

        System.out.println("  " );

        System.out.println("Código do Livro Livraria: "+livrolivraria.getCodigo());
        System.out.println("Titulo do Livro : "+livrolivraria.getTitulo());
        System.out.println("Autor do Livro : "+livrolivraria.getAutor());
        System.out.println("Editora do Livro : "+livrolivraria.getEditora());
        System.out.println("Numero de paginas do Livro : "+livrolivraria.getNrPaginas());
        System.out.println("Edicao do Livro : "+livrolivraria.getEdicao());
        System.out.println("Localização do Livro : "+livrolivraria.getLocalPrateleira());
        System.out.println("Categoria do Livro : "+livrolivraria.getCategoria());
        System.out.println("Preco do Livro : "+livrolivraria.getPreco());
        System.out.println("Estado do livro : "+livrolivraria.getNovoUsado());

        System.out.println("  " );

        System.out.println("Código do Livro Biblioteca: "+livrobiblioteca.getCodigo());
        System.out.println("Titulo do Livro : "+livrobiblioteca.getTitulo());
        System.out.println("Autor do Livro : "+livrobiblioteca.getAutor());
        System.out.println("Editora do Livro : "+livrobiblioteca.getEditora());
        System.out.println("Numero de paginas do Livro : "+livrobiblioteca.getNrPaginas());
        System.out.println("Edicao do Livro : "+livrobiblioteca.getEdicao());
        System.out.println("Localização do Livro : "+livrobiblioteca.getLocalPrateleira());
        System.out.println("Categoria do Livro : "+livrobiblioteca.getCategoria());
        System.out.println("Prazo de devolucao : "+livrobiblioteca.getPrazo());
        System.out.println("Locatario do Livro : "+livrobiblioteca.getNomeLocatario());
    }
}