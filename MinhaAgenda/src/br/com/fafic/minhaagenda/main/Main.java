package br.com.fafic.minhaagenda.main;
import br.com.fafic.minhaagenda.controller.AgendaController;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();

        controller.adicionar("José", "9 1212-1212");
        controller.adicionar("Fernando", "9 2323-2323");
        controller.adicionar("Paulo", "9 3434-3434");
        controller.adicionar("Wellington", "9 4545-4545");
        controller.adicionar("Margarete", "9 5656-5656");
        controller.adicionar("André", "9 6767-6767");
        controller.mostrarAgenda();

        controller.totalContatos();

        controller.buscar("José", "nome");
        controller.buscar("9 1212-1212", "numero");

        controller.remover("Margarete", "nome");
        controller.totalContatos();

        controller.remover("9 2323-2323", "numero");
        controller.totalContatos();

        controller.mostrarAgenda();
    }
}
