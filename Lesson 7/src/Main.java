import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    /*public static void  writeUserToFile(UserJava []users, String Filename) throws IOException {
        FileOutputStream fos= new FileOutputStream(Filename);//FileOutputStream - создает поток для записи файла
        ObjectOutputStream oos=new ObjectOutputStream(fos);//ObjectOutputStream - создает поток для записи объекта из оперативной памяти

        for (int i=0;i<users.length;i++){
            oos.writeObject(users[i]);
        }

        oos.close();// close - для того чтобы файл был закрыт и мог использоваться вдельнейшем, а винда не писала "файл уже используется"
        fos.close();

    }*/

    /*public static  void showUsers(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream ois=new ObjectInputStream(fis);

        while (true){
            Object obj=null;
            try{
                obj=ois.readObject();
            }catch (Exception e){
                break;
            }

            UserJava u= (UserJava) obj;// преобразование переменной obj в тип UserJava
            System.out.print(u.id);
            System.out.println(" "+u.name);
        }
        ois.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserJava u= new UserJava();
        u.id=100;
        u.name="User100";
        UserJava u2=new UserJava();
        u2.id=102;
        u2.name="User102";

        UserJava[]users={u,u2};
        /*writeUserToFile(users,"users.txt");*/
        /*showUsers("users.txt");*/



    /*public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserJava u= new UserJava();
        u.id=100;
        u.name="User100";
        UserJava u2=new UserJava();
        u2.id=102;
        u2.name="User102";

        UserJava[]users={u,u2};

        String s=String.valueOf(123);
        System.out.println(s);

    }*/




    /*public static void main(String[] args){
        String s=String.valueOf(123); // преобразование из числа в строку
        System.out.println(s);

        float f= Float.parseFloat("123f");//преобразование из строки в число
        System.out.println(f*2);

    }*/



    //КОЛЛЕКЦИИ
    /*public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(12);
        list.add(0,10);
        list.add(5);
        list.add(1,7);
        list.add(10);
        System.out.println(list.size());// list.size() - возвращает количество объектов в коллекции.
        System.out.println(list);
        System.out.println(list.get(2));// возвращает элемент коллекции  в данном случае под индексом №2
        Integer k=10;
        list.remove(k);// удаляет объект со значением 10. находит только первое значение 10 и удаляет его.
        list.remove(1);// удаляет объект в данном случае под индексом №1
        System.out.println(list);
        int size=list.size();
        System.out.println("Size коллекции "+size);// возвращает количество объектов в коллекции.

        for(Integer i: list){
            System.out.println(i*i);
        }

    }*/


    //ТИП коллекции: множество
    /*public static void main(String[] args){
        HashSet<String> set=new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Hello");
        System.out.println(set);
    }*/


    //Тип коллекции: Dictionary
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ivanov",7458643);
        map.put("Zamuhryshkin",4569887);
        map.put("Pitkin",5498456);
        map.put("Ivanov",9845854);
        System.out.println(map);
        System.out.println(map.get("Pitkin"));
        map. remove("Ivanov");
        System.out.println(map);
    }

}
