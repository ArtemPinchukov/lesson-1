public class Suppliers {
    @Override
    public  String toString(){
        String s=String.format("id:%d, name:%s, address:%s, phone:%s, email:%s, date:%s\n",id,name,address,phone,email,date_reg);
        return s;
    }

    public  int id;
    public  String name;
    public  String email;
    public  String phone;
    public  String address;
    public  String date_reg;

}
