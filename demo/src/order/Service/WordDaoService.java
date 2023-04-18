package order.Service;

import order.Dao.WorkDao;
import order.Do.User;

import java.util.Scanner;

public class WordDaoService implements WorkDao {


    @Override
    public int login(User user) {



        return 0;
    }

    @Override
    public User sign(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入你的电话号码：");
        String phone = scanner.nextLine();
        System.out.print("请输入你的密码：");
        String password1 = scanner.nextLine();
        System.out.print("请确认你的密码：");
        String password2 = scanner.nextLine();

        if (checkPhone(phone)&&checkPassword(password1,password2)){

        }else {
            return null;
        }

        return null;
    }

    //核验密码
    //1.密码是否规范
    //2.第一次密码与第二次密码是否相符

    boolean checkPassword(String first,String second){
        if(first.length()<6){
            System.out.println("密码不符合");
            return false;
        }

        if(first.equals(second)){
            return true;
        }else {
            System.out.println("两次密码不一致");
            return false;
        }
    }

    //核验电话号码
    boolean checkPhone(String phone){
        if (phone.length()!=11){
            System.out.println("电话号码不正确");
            return false;
        }else {
            return true;
        }
    }




}
