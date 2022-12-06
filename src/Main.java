import Transport.Train;
import Transport.Bus;

public class Main {
    public static void main(String[] args) {
        Train Ласточка = new Train("B-901", 2011, "Россия", 301, "Ласточка", 3500,
                100, " отБеларусского вокзала ", " до станции Минск ", 11,78,1);
        Train Ленинград = new Train("D-125", 2019, " Россия ", 270, "Ленинград", 1700,
                100, " от Ленинградского вокзала ", " до станции Ленинград-Пфссажирский", 8,50,1);
//        Ленинград.print();
//        Ласточка.print();

        Bus Пазик = new Bus("D-43", 1991, " Россия ", 70, " Пазик ",31,5);
        Bus школьный = new Bus("D-gf", 1954, " Россия ", 80, " школьный ",15,5);
        Bus miniPazik = new Bus("GT-12", 2019, " Россия ", 170, " miniPazik ",100,5);
//        Пазик.print();
//        школьный.print();
//        miniPazik.print();
    }


}