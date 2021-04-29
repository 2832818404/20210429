package eud.xcdq.demo02;

/**
 * @author hongxiaozheng
 * @date 2021/4/29 11:14
 */
public class PowerDoor implements Door{
    @Override
    public void open() {
        System.out.println("电动门打开");
        System.out.println(des);
    }

    @Override
    public void close() {
        System.out.println("电动门关闭");
        System.out.println(des);
    }
}
