package run.test;


/**
 * Created by Mars on 2022/3/25
 */
public class Login {

    public void login(String username, String password) {
        System.out.println("开始登录~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(username + " 登录成功");
    }

    public boolean check(String username, String password) {
        System.out.println("检查 用户名和密码是否 有效");
        return true;
    }
}
