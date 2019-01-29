import java.util.ArrayList;
public class Biblioteca {
    public final int MAX_LIVROS = 100;

    ArrayList<Livro> livros;
    public Biblioteca () {
        num_livros = 0;
        livros = new ArrayList<Livro>(MAX_LIVROS);
    }
    public void doacaoLivro(String ID, String titulo, String autor, String ano, String status, String emprestado_para, String editora) {
        Livro livro = new Livro(ID, titulo, autor, ano, status, emprestado_para);
        livros.add(livro);
    }
    public void doacaoLivro(Livro livro) {livros.add(livro);}
    public Livro devolveLivro(String ID){
        for (int = 0;i<livros.size(); i++) {
            if(livros.get(i).getID().equals(ID)) return livros.get(i);
                
                return null;
        }
    }
    public void printLista(){
        for(int i=0; i<livros.size();i++){
            System.out.println(livros.get(i).getTitulo());
        }
    }
    public int numeroLivros(){
        num_livros = livros.size();
        return num_livros;
    }
}
public class Livro {
    private String ID, titulo, autor, ano, status, emprestado_para;
    public boolean Emprestado;
    
    public boolean Emprestado() {
        return Emprestado == true;
    }
    ArrayList<String> autores;
    public Livro(String ID, String titulo, String autor, String ano, String status, String emprestado_para){
        this.titulo = titulo;
        this.ID = ID;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
        this.emprestado_para = emprestado_para;
    }
    public String getID(){
        return ID;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getAno(){
        return ano;
    }
    public String getStatus(){
        return status;
    }
    public String getEmprestado(){
        return emprestado_para;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setEmprestado(String emprestado_para){
        this.emprestado_para = emprestado_para;
    }
}
public class Menu {
    public static void main(String[] args) {
        System.out.println("O que deseja fazer?\n");
        System.println("1 - Doar um livro");
        System.println("2 - Retirar um livro");
        System.println("3 - Devolver um livro");
        System.println("0 - Sair\n");
        Scanner opcao = new Scanner(System.in);
        Biblioteca bi1 = new Biblioteca();
        String b1, b2, b3, b4, b5, b6;
        boolean keep = true;
        do {
            switch(opcao.nextInt()) {
                case 1:
                    System.out.println("Digite o número do livro:");
                    b1 = opcao.nextLine();
                    System.out.println("Digite o título do livro:");
                    b2 = opcao.nextLine();
                    System.out.println("Digite o autor do livro:");
                    b3 = opcao.nextLine();
                    System.out.println("Digite o ano do livro:");
                    b4 = opcao.nextLine();
                    System.out.println("Digite o status do livro:");
                    b5 = opcao.nextLine();
                    System.out.println("Digite quem está com o livro:");
                    b6 = opcao.nextLine();
                    bi1.addLivro(b1, b2, b3, b4, b5, b6);
                    break;
                case 2:
                    System.out.println("Digite o título do livro que deseja retirar");
                    b2 = opcao.nextLine();
                    bi1.retirar(b2);
                    break;
                case 3:
                    System.out.println("Digite o título do livro que deseja devolver");
                    b2 = opcao.nextLine();
                    bi1.devolveLivro(b2);
                    break;
                case 0:
                keep = false;
                break;
                default:
                System.out.println("Opção não encontrada.\n");
            }while(keep=true);
        }
    }
}