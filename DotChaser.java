import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

  
    public static void main(String[] args) {
        int N = 200;
        if (args.length != 0)
            N = Integer.parseInt(args[0]);

        ThingList list = new ThingList();
        int count = 0;

        while (true) {
            if (count % N == 0) {
                list.add(new TypeA());
                list.add(new TypeB());
                list.add(new TypeC());
            }

            list.printAll();
            System.out.println("done");
            System.out.flush();
          
            list.moveAll();
            count++;
        }
    }
}
