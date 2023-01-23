import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de java", 18);


        Conteudo mentoria1 = new Mentoria("Mentoria de Js", "Nova mentoria de Js");
        System.out.println(curso1);
        System.out.println(mentoria1);




    }
}