import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       /* User u=new User();
        u.toString();
        System.out.println(u.toString());*/



        /*User u=new User();
        u.id=10;
        u.name="Vasya";
        u.height=170.5f;
        System.out.println(u.toString());
        System.out.println(u);
        User u2=new User();
        u2.id=10;
        if (u.equals(u2)){ //equals - одинаковый, равный
            System.out.println("Equals");
        }
        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());*/



        //Интерфейс
        Boss b= new Boss();
        Worker w=new Worker();
        Cleaner c=new Cleaner();
        w.goToWork();
        w.pay();
        goToWork(b);
        goToWork(w);
        goToWork(c);





        File f=new File("1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br= new BufferedReader(fr);
        String content="";
        while (true){ // бесконечный цикл
            String s=br.readLine();
            if(s==null) { // проверяет конец файла
                break;
            }
            content +=s+"\n";
        }
        content += "преовоп1";

        PrintWriter writer= new PrintWriter/*записывает в Файл*/("1.txt","UTF-8"); // UTF - метод кодировки;PrintWriter-записывает в Файл
        writer.println(content);
        writer.close();



    }

    public static void goToWork(IWorker employee) {
        employee.goToWork();
    }
    public static void pay(IWorker employee) {
        employee.pay();
    }




}
