import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


        public static void main(String[] args) {
            Queue<Person> queue = new LinkedList<>(generateClients());
            while (!queue.isEmpty()) {
                Person personPool = queue.poll();
                personPool.Tickets = personPool.Tickets - 1;
                System.out.printf("%s %s прокатился на атракционеосталось %d билетов\n", personPool.name, personPool.sureName, personPool.Tickets);
                if (personPool.Tickets > 0) {
                    queue.add(personPool);
                }
            }
        }

        private static List<Person> generateClients() {
            return List.of(
                    new Person("Сан", "Доменов", 1),
                    new Person("Клава", "Штерн", 3),
                    new Person("Александр", "Зюзин", 4),
                    new Person("Артемий", "Иванов", 5),
                    new Person("Майкл", "Кузьмин", 2)
            );
    }
}