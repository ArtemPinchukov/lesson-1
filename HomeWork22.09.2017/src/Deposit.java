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
        for (int a=1;a<4;a++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите PIN-код.Попытка № "+a);
            int pin = sc.nextInt();
            if (pin != PinCode&&a<3) {
                System.out.println("PIN-код введен неверно");
            }
            else{
                throw new MyException();
            }
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