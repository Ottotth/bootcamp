import java.util.PriorityQueue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Event {
    private Impoirtance impoirtance;
    private String name;
    private LocalDate date;



    public static class SortedByImpoirtance implements Comparator<Event> {
        // Sort by impoirtance from FAST to SLOW and then by date from earliest to latest
        @Override
        public int compare(Event e1, Event e2) {
            if (e1.impoirtance.ordinal() > e2.impoirtance.ordinal()) {
                return -1;
            } else if (e1.impoirtance.ordinal() < e2.impoirtance.ordinal()) {
                return 1;
            }
            if (e1.date.isBefore(e2.date)) {
                return -1;
            } else if (e1.date.isAfter(e2.date)) {
                return 1;
            }
            return 0;

        }
    }



    public enum Impoirtance {
        SLOW, MEDIUM, FAST
    }

    public Event(String name, Impoirtance impoirtance, LocalDate date) {
        this.name = name;
        this.impoirtance = impoirtance;
        this.date = date;
    }



    @Override
    public String toString() {
        return "\nEvent{" + " Date=" + date + " | impoirtance=" + impoirtance
                + " | name='" + name + '\'' + '}' + "\n";
    }

    public static void main(String[] args) {
        PriorityQueue<Event> eventQueue =
                new PriorityQueue<>(new SortedByImpoirtance());
        eventQueue.add(new Event("Event A", Impoirtance.FAST,
                LocalDate.of(2024, 6, 1)));
        eventQueue.add(new Event("Event B", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 2)));
        eventQueue.add(new Event("Event C", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 3)));
        eventQueue.add(new Event("Event D", Impoirtance.FAST,
                LocalDate.of(2024, 6, 4)));
        eventQueue.add(new Event("Event E", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 5)));
        eventQueue.add(new Event("Event F", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 6)));
        eventQueue.add(new Event("Event G", Impoirtance.FAST,
                LocalDate.of(2024, 6, 7)));
        eventQueue.add(new Event("Event H", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 8)));
        eventQueue.add(new Event("Event I", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 9)));
        eventQueue.add(new Event("Event J", Impoirtance.FAST,
                LocalDate.of(2024, 6, 10)));
        eventQueue.add(new Event("Event K", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 11)));
        eventQueue.add(new Event("Event L", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 12)));
        eventQueue.add(new Event("Event M", Impoirtance.FAST,
                LocalDate.of(2024, 6, 13)));
        eventQueue.add(new Event("Event N", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 14)));
        System.out.println(eventQueue.size());

        int i = 0;
        while (!eventQueue.isEmpty()) {
            System.out.println(eventQueue.poll());
            i++;
        }
        System.out.println("Total :" + i);

        System.out.println("\n-----------------\n");

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("Event A", Impoirtance.FAST,
                LocalDate.of(2024, 6, 1)));
        events.add(new Event("Event B", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 2)));
        events.add(new Event("Event C", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 3)));
        events.add(new Event("Event D", Impoirtance.FAST,
                LocalDate.of(2024, 6, 4)));
        events.add(new Event("Event E", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 5)));
        events.add(new Event("Event F", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 6)));
        events.add(new Event("Event G", Impoirtance.FAST,
                LocalDate.of(2024, 6, 7)));
        events.add(new Event("Event H", Impoirtance.SLOW,
                LocalDate.of(2024, 6, 8)));
        events.add(new Event("Event I", Impoirtance.MEDIUM,
                LocalDate.of(2024, 6, 9)));
        events.add(new Event("Event J", Impoirtance.FAST,
                LocalDate.of(2024, 6, 10)));

        Collections.sort(events, new SortedByImpoirtance());
        System.out.println(events);



    }

}
