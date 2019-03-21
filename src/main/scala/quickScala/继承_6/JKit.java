package quickScala.继承_6;

/**
 * @author zry
 * @date 2018/8/16 23:10
 */
public class JKit {

    static class Pserson extends JKit{

    }

    public static void main(String[] args) {
        Pserson pserson = new Pserson();
        if (pserson instanceof JKit) {
            System.out.println("true");
        }
    }
}
