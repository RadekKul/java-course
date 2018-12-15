package pl.com.rkulikowski.java14.thread;

// Chcemy aby watek zaczal prace po afterThis i to wywolamy w mnadpisanej metodzie start

public class PwcWorker extends Thread{

    private Runnable jobToDo;
    private Thread afterThis;

    public PwcWorker(String name, Runnable jobToDo, Thread afterThis){
        super(jobToDo); // wskazujemy PwcWorkerowi co ma zrobic za prace, potem ustawiamy mu imie, potem przypisujemy mu dane
        setName(name);  // metoda ogolna w Threadach umozliwia nam nadanie imienia zamiast Thread-0 itd, broni nas przed nullem odrazu
        this.jobToDo = jobToDo;
        this.afterThis = afterThis;
    }

    // w celu ustawienia wykonywanie watku jeden po drugim, nadpiszemy metode start
    @Override
    public synchronized void start() {  // synchronized nie pozwala na jednym obiekcie wykonac dwoch watkow na raz, musimy stworzyc dwa obiekty zeby to zrobic(???)
        try{
            afterThis.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.start();
    }
}
