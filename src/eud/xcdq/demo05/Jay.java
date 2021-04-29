package eud.xcdq.demo05;

/**
 * @author hongxiaozheng
 * @date 2021/4/29 19:37
 */
public class Jay {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age > 140 || age < 0 ) {
            System.out.println("输入年龄有误");
        }else {
            this.age = age;
        }
    }
}
