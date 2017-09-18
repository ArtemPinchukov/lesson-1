public class Урок3 {
    public static void main(String[] args){
        Human h = new Human(); //выделяет столько места сколько занимает класс Human
        h.name = "Vasyan";
        h.sleep(4,5);
        System.out.println(h.name);

        Human.eyeCount=3;
        System.out.println(Human.eyeCount);

        Human h2 = h; //без " new" не создается новая переменная, а создается ссылка.
        h2.name = "Sashka";
        System.out.println(h.name);
        System.out.println(h2.name);

        Child m = new Child();
        m.name = "Van'ka";
        m.cook();

        Men k = new Men("ghjgjhgjh");
        //k.name = "Kolyan";
        k.cook();
    }

    static int add(int a,int b){//add - мы назвали так функцию. Её можно назвать как угодно.
        int c=a+b;
        return c;// после return функция прекращает работу
    }

    static int min(int a,int b){
        if (a>b) {
            System.out.println("Минимальной значение " + b);
            return b;
        }
        else {
            System.out.println("Минимальной значение " + a);
            return a;
        }
    }

}
