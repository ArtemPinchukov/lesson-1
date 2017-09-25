public class User {
    public int id;
    public String name;
    public float height;

    @Override //- декоратор; переписывает наследие у родителя
    public boolean equals(Object obj) {
        User user2=(User)obj; //преобразует obj к типу User
        return this.id==user2.id;
    }

    @Override
    public int hashCode() {
        return 17;
    }
    @Override
    public String toString() {
       return  String.format("[%d] Name:%s Height:%.1f",id,name,height);
    }
}
