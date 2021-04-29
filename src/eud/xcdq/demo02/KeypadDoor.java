package eud.xcdq.demo02;

/**
 * @author hongxiaozheng
 * @date 2021/4/29 11:13
 */
public class KeypadDoor implements Door{
    @Override
    public void open() {
        System.out.println("密码门打开");
    }

    @Override
    public void close() {
        System.out.println("密码门关闭");
    }
}
