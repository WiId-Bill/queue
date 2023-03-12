import Person.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClients();
        Queue<Person> att = new LinkedList<>(people);
        while (!att.isEmpty()) {
            Person person = att.poll();
            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);
            System.out.printf("\n %s %s Прокатился на аттракционе,у него осталось  %d билетов.", person.getName(), person.getSurName(), person.getQuantityTickets());
            if (quantityTickets > 0) {
                att.offer(person);
            }
        }
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Ivan", "Vasilev", 3),
                new Person("Petya", "Ivanov", 5),
                new Person("Tanay", "Maximova", 1),
                new Person("Olya", "Petrova", 4),
                new Person("Alex", "Tern", 3)
        );
    }
}
