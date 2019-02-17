import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        ArrayList<emails> List = new ArrayList<>();
        List.add(new emails("test@gmail.com"));

        List.add(new emails("te.st@gmail.com"));

        List.add(new emails("te+st@gmail.com"));

        List.add(new emails("te.s+t@gmail.com"));

        test(List);

    }


    public static void test(ArrayList<emails> emails) {
        for (int i = 0; i < emails.size(); i++) {
            String string = String.valueOf(emails.get(i));
            int cheak = string.indexOf(".");


            if (cheak != -1) {

                string = string.replace(".", "");
                string = string.replaceAll("'+'", "@");

                System.out.println(string);

            }


        }

    }


}
