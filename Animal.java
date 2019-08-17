package xiangmu;

//抽象父类

public abstract class Animal {

    private String name;
    private int age;
    //空参构造
    public Animal(){

    }
    //有参构造
    public Animal(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
     //get与set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void love();//描述喜好，抽象方法
}
