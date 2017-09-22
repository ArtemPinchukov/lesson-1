import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*File f= new File("1.txt");
        if(!f.exists()){// exict - существует. !exists - не существувет
            f.createNewFile();
        }
        if(f.canWrite()){ //canWrite - доступен для записи
            System.out.println(("Файл доступен для записи"));
        }else {
            System.out.println(("Файл не доступен для записи"));
        }
        if (f.isHidden()){ //Hidden - скрытый
            System.out.println("Файл скрыт");
        }else{
            System.out.println("Файл не скрыт");
        }
        //f.delete();// файл f удаляется
        System.out.println(f.getAbsolutePath()); // getAbsolutePath - возвращает адрес файла f
        System.out.println(f.getFreeSpace()); //getFreeSpace - показывает сколько свободного места на диске, на котором записан файл f
        if(f.isFile()){ //isFile - это файл
            System.out.println("Это файл");
        }
        if(!f.isDirectory()){ // isDirectory - это папка
            System.out.println("Это не папка");
        }
        System.out.println(f.lastModified()); //lastModified - возвращает сколько милисекунд прошло с 01.01.1970
        System.out.print("Размер файла:");
        System.out.println(f.length()); //length -размер файла

        File f2=new File("2.txt");
        if(!f.renameTo(f2)){ //rename - переименование файла
            System.out.println("Не удается переименовать файл");

        }
        System.out.println(f.getAbsolutePath());*/



        /*File f= new File("1.txt");
        if(!f.exists()) {// exict - существует. !exists - не существувет
            f.createNewFile();
        }
        f.setWritable(true);//Writable - записываемый. если true, то доступен для изменения; если false, то доступен только для чтения
        f.setLastModified(0);*/




       /*File dir= new File("test\\");
        if(!dir.exists()) {// exict - существует. !exists - не существувет
            dir.mkdir(); //mkdir - создает папку test
        }*/
        /*File dir2= new File("test1\\res\\");
        if(!dir2.exists()) {// exict - существует. !exists - не существувет
            dir2.mkdirs(); //mkdirs - создает все папки переменной dir2
        }*/


        /*File[]files=dir.listFiles(); //listFiles - массов из списка файлов
        for(int i=0;i<files.length;i++){
            files[i].setWritable(false);
        }*/



        /*String s="Good ";
        s=s.concat("luck!");
        s="<"+s+">";
        System.out.println(s);
        if(s.indexOf("G")>=0);{ //indexOf - возвращает номер(индекс), которому соответствует выбранный символ
            System.out.println(s.indexOf("G"));
        }
        if(s.equals("<Good luck!>"));{//equals - сравнение строк
            System.out.println("Строки равны");
        }
        if(s.equalsIgnoreCase("<good luck!>"));{//equalsIgnoreCase - сравнивает строки не смотря на какими буквами написано( строчными или прописными)
            System.out.println("Строки равны независимо строчные или прописные");
        }
        System.out.println(s.toUpperCase()); //toUpperCase - выводит все прописные буквы
        System.out.println(s.toLowerCase()); //toLowerCase - выводит все строчные буквы*/





        /*String format =String.format("My name is %s.I have %d years old. My height is %.1f cm","Vasya",26,176.5f); // %s - вставляет строку; %d - вставляет целое число; %f - ваставляет вещественное(дробное) число; %.1f -  .1 означает сколько цифр после запятой будет выводиться на экран; %с - вставляет символ
        System.out.println(format);*/



        String format =String.format("My name is %s.\nI have %d years old. \tMy height is %.1f cm","Vasya",26,176.5f); // %s - вставляет строку; %d - вставляет целое число; %f - ваставляет вещественное(дробное) число; %.1f -  .1 означает сколько цифр после запятой будет выводиться на экран; %с - вставляет символ
        System.out.println(format); // \n - с нового абзаца, \t - табуляция
    }

}
