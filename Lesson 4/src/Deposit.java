import java.util.Scanner;

//Задача про депозит в банке.
public class Deposit {
    private float balance;
    private int PinCode;
    public void setPinCode(int PinCode) {
        this.PinCode = PinCode;
    }
    public void add(float sum){
        balance+=sum;
    }
    public void getMoney(float sum) throws MyException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите PIN-код");
        int pin=sc.nextInt();
        if(pin!=PinCode){
            throw
            //MyException mex = new MyException();
            //throw mex;
        }

        balance-=sum;
    }

    public void printMyBalance(){
        System.out.print("Ваш баланс составляет ");
        System.out.println(balance);
    }
}
