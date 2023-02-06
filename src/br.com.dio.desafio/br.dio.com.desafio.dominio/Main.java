import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descreição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descreição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria c");
        mentoria.setDescricao("Descreição mentoria c");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDrescricao("Descreição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdriano = new Dev();
        devAdriano.setNome("Adriano");
        devAdriano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Adriano " + devAdriano.getConteudoInscristos());
        devAdriano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Adriano " + devAdriano.getConteudoInscristos());
        System.out.println("Conteúdos concluidos Adriano " + devAdriano.getConteudoConcluidos());
        System.out.println("XP: " + devAdriano.calcularTotalXp());

        System.out.println("---------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudoInscristos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudoInscristos());
        System.out.println("Conteúdos concluidos João " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}
