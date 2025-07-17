public class SistemaLivros2 {

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

        String mensagem = "\nCodigo: "+livro.getCodigo()+
                          "\nTitulo: "+livro.getTitulo()+
                          "\nEditora: "+livro.getEditora()+
                          "\nNumero de paginas: "+livro.getNrPaginas()+
                          "\nEdicao: "+livro.getEdicao();

        System.out.println("  " );
        System.out.println("Livro: "+ mensagem);

        System.out.println("  " );

        String mensagem1 = "\nCodigo: "+livrolivraria.getCodigo()+
                          "\nTitulo: "+livrolivraria.getTitulo()+
                          "\nAutor: "+livrolivraria.getAutor()+
                          "\nEditora: "+livrolivraria.getEditora()+
                          "\nNumero de paginas: "+livrolivraria.getNrPaginas()+
                          "\nEdicao: "+livrolivraria.getEdicao()+
                          "\nLocalizao: "+livrolivraria.getLocalPrateleira()+
                          "\nCategoria: "+livrolivraria.getCategoria()+
                          "\nPreco: "+livrolivraria.getPreco()+
                          "\nEstado: "+livrolivraria.getNovoUsado();

        System.out.println("  " );
        System.out.println("Livro Livraria: "+ mensagem1);

        System.out.println("  " );

        String mensagem2 = "\nCodigo: "+livrobiblioteca.getCodigo()+
                          "\nTitulo: "+livrobiblioteca.getTitulo()+
                          "\nAutor: "+livrobiblioteca.getAutor()+
                          "\nEditora: "+livrobiblioteca.getEditora()+
                          "\nNumero de paginas: "+livrobiblioteca.getNrPaginas()+
                          "\nEdicao: "+livrobiblioteca.getEdicao()+
                          "\nLocalizao: "+livrobiblioteca.getLocalPrateleira()+
                          "\nCategoria: "+livrobiblioteca.getCategoria()+
                          "\nPrazo: "+livrobiblioteca.getPrazo()+
                          "\nLocatario: "+livrobiblioteca.getNomeLocatario();

        System.out.println("  " );
        System.out.println("Livro Biblioteca: "+ mensagem2);
    }
}