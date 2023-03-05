import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Math.random();

        ArrayList<Integer> arr = new ArrayList<>();
        // arr.si
        sayHi();
        Main.sayHi();
        int[] rndArr = {3,5,10};
        int result = Matematika.sumIntArr(rndArr);
        System.out.println(result);
        Student student = new Student();
        student.name = "Jokubas";
        System.out.println(student.name);
        student.surname = "Valatka";
        student.age = 36;
        student.gender = true;

        Student student2 = new Student();
        student2.name = "Veronika";
        System.out.println(student.name);
        student2.surname = "Jakubaitiene";
        student2.age = 40;
        student2.gender = false;

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);

        Student student3 = new Student("Jonas","Burminskas", 24,true);

        Car masina = new Car();
        masina.setModel("Peogeot");
        System.out.println(  masina.getModel());

        System.out.println(student3);

        System.out.println("-------------------------------------------------------------");

        Book book = new Book();
        book.pages = 100;
        book.releaseYear = 2019;
        book.title = "Tunder";

        Book book2 = new Book();
        book2.pages = 140;
        book2.releaseYear = 2018;
        book2.title = "Animal Planet";

        Book book3 = new Book();
        book3.pages = 50;
        book3.releaseYear = 2020;
        book3.title = "Student book";

        Book book4 = new Book("Apocalypse", 250, 2000); //-paleistas konstruktorius
        Book book5 = new Book("Project X", 100, 2020);
        Book book6 = new Book("System", 546, 1950);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println(books);

        System.out.println("-------------------------------------------------------------");

        Plant augalas = new Plant();
        augalas.setTitle("Meksikinis žydrūnis");
        augalas.setLatinName("Ageratum houstonianum");
        augalas.setYear(true);
        augalas.setTheContinent("Pietų amerika");
        augalas.setPlantHeightInMeters(0.7);
        augalas.setEatable(true);

        Plant augalas2 = new Plant();
        augalas2.setTitle("Pallenis");
        augalas2.setLatinName("Asteriscus maritimus");
        augalas2.setYear(false);
        augalas2.setTheContinent("Portugalija");
        augalas2.setPlantHeightInMeters(0.15);
        augalas2.setEatable(true);

        Plant augalas3 = new Plant("Sutera","Bacopa", true,  "North and South America", 1.00, false);
        Plant augalas4 = new Plant("Žieminė begonija", "Begonia elatior", true, "South and Central America, Africa, and Southern Asia", 0.35, false);

        ArrayList<Plant> augalai = new ArrayList<>();
        augalai.add(augalas);
        augalai.add(augalas2);
        augalai.add(augalas3);
        augalai.add(augalas4);

        System.out.println(augalai);




















    }

    public static void sayHi(){
        System.out.println("hi");
    }





}