import java.util.Scanner;

public class ProductQuery {
    public static void main(String[] args) {
        int flag = -1;
        String product[][]={{"衣服","150","这件衣服好看！"},{"帽子","60","这个帽子时尚!"},{"鞋","256","这双鞋保暖！"},{"手套","15","这副手套实用！"}};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的商品名称：");
        String name= sc.next();
        switch (name){
            case "衣服":flag=0;break;
            case "帽子":flag=1;break;
            case "鞋":flag=2;break;
            case "手套":flag=3;break;
            default:
                System.out.println("商品名称输入错误！！");
        }

        while(flag!=-1) {
            System.out.println("你要查看的商品具体信息为：");
            System.out.print("商品名称：" + product[flag][0]);
            System.out.println();
            System.out.print("商品价格："+product[flag][1]);
            System.out.println();
            System.out.print("商品描述："+product[flag][2]);
            System.out.println();
            break;
        }
    }
}
