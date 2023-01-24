import com.dio.desafio.dominio.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de java", 18);
        Curso curso2 = new Curso("C#", "Curso de c#", 25);
        Curso curso3 = new Curso("Golang", "Curso para GoLang", 15);


        Conteudo mentoria1 = new Mentoria("Mentoria front-end", "Nova mentoria para devs no front-end");
        Conteudo mentoria2 = new Mentoria("Mentoria back-end", "Nova mentoria para devs no back-end");

        BootCamp bootCamp = new BootCamp("BootCamp FULL STACK", "Novo bootcamp full-stack");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(curso3);
        bootCamp.getConteudos().add(mentoria1);
        bootCamp.getConteudos().add(mentoria2);


        Dev dev1 = new Dev("Jean");
        dev1.inscreverBootCamp(bootCamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1);



    }
}