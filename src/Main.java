import Transport.transport;
import Transport.train;
import Transport.bus;

public class Main {
    public static void main(String[] args) {
        train Ласточка = new train("B-901", 2011, "Россия", 301, "Ласточка", 3500,
                100, " отБеларусского вокзала ", " до станции Минск ", 11,78,1);
        train Ленинград = new train("D-125", 2019, " Россия ", 270, "Ленинград", 1700,
                100, " от Ленинградского вокзала ", " до станции Ленинград-Пфссажирский", 8,50,1);
//        Ленинград.print();
//        Ласточка.print();

        bus Пазик = new bus("D-43", 1991, " Россия ", 70, " Пазик ",31,5);
        bus школьный = new bus("D-gf", 1954, " Россия ", 80, " школьный ",15,5);
        bus miniPazik = new bus("GT-12", 2019, " Россия ", 170, " miniPazik ",100,5);
//        Пазик.print();
//        школьный.print();
//        miniPazik.print();
    }


}