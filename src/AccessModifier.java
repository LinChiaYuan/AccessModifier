/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
import Human.Man;

public class AccessModifier
{
    public static void main(String[] args)
    {
        int i = 10;

        Man mMan = new Man();
        mMan.setCount(i);

        System.out.println("i : " + i);
        System.out.println("getCount() : " + mMan.getCount());
        int s = mMan.getCount();
        s = 100;
        System.out.println("i : " + i);
        System.out.println("s : " + s);
        System.out.println("getCount() : " + mMan.getCount());


    }
}
