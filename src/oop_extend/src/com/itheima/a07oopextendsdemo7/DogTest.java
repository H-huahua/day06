package oop_extend.src.com.itheima.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();



        oop_extend.src.com.itheima.a07oopextendsdemo7.ChineseDog cd = new oop_extend.src.com.itheima.a07oopextendsdemo7.ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
