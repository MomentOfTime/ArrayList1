import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> allList = null;
        allList = new ArrayList<String>();
        allList.add("HELLO");  //增加
        allList.add("WORD");
        allList.add(0,"LIJI");
        System.out.println("删除前");
        for(int i=0; i<allList.size();i++){
            System.out.print(allList.get(i)+ ".");
        }
        System.out.println();
        System.out.println("删除第三个字符：");
        allList.remove(2);
        for(int i=0; i<allList.size();i++){
            System.out.print(allList.get(i)+ ".");
        }
        System.out.println();
        System.out.println("查找：");
        System.out.println(allList.contains("HELLO")?  "\"HELLO\"字符存在！" :"\"HELLO\"字符不存在！" );
        System.out.println("HELLO字符的位置:" +allList.indexOf("HELLO"));
        System.out.println("更改前----");
        for(int i=0; i<allList.size();i++){
            System.out.print(allList.get(i)+ ".");
        }
        System.out.println();
        System.out.println("改------------");
        allList.set(1,"Hello");
        System.out.println("更改后:");
        for(int i=0; i<allList.size();i++){
            System.out.print(allList.get(i)+ ".");
        }

    }

}
