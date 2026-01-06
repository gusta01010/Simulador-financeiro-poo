import java.time.LocalDate;
import java.util.ArrayList;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(99);
        curso1.setTitulo("Programa");
        curso1.setDescricao("Legal");
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(1);
        curso2.setTitulo("Programa 2");
        curso2.setDescricao("Legal 2");
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria");
        mentoria1.setDescricao("Mentoria");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
    
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());
        Dev devLara = new Dev();
        devLara.setNome("Lara");
        devLara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devLara.getConteudosInscritos());
        devLara.progredir();
        System.out.println("Conteúdos concluídos " + devLara.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos " + devLara.getConteudosInscritos());
        System.out.println("XP: "+ devLara.calcularTotalXp());




    }
}
