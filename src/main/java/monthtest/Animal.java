package monthtest;


/**
 * Created by Administrator on 2017/4/8 0008.
 */
/*按以下要求编写程序
(1) 编写 Animal 接口，接口中声明 eat() 方法
(2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
(3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
*/
public interface Animal {
    public void  eat();
}
class Bird implements Animal{

    @Override
    public void eat() {

    }
    public void flying(){
        System.out.println("Bird can flying");
    }
}
class Fish implements Animal{

    @Override
    public void eat() {

    }
    public void swimming(){
        System.out.println("Fish can swimming");
    }

}
class Test {
    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.eat();
        fish.swimming();
        Bird bird=new Bird();
        bird.eat();
        bird.flying();
    }
}