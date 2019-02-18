/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package biological;

public class Creater
{
    /*
    *
    Modifier   Class 　同package　  子孫　其他package
    public 　　　 O　　　　 O　　　　　O　　　　O
    protected　　 O　　　　 O　　　　　O　　　　X
    friendly　　  O　　　　 O　　　　　X　　　  X           不寫默認為friendly
    private　　　 O　　　　 X　　　　　X　　　  X
    *
    * */
    private int Num = 0;
    String Name = "";
    public int blood = 0;
    protected int money = 0;
    private Creater createrl;

    public Creater()
    {

    }

    public int asd()
    {
        return createrl.asd();
    }

    public Creater(int num, String name, int blood, int money)
    {
        Num = num;
        Name = name;
        this.blood = blood;
        this.money = money;
    }

    public int getNum() {
        return Num;
    }
    public void setNum(int num) {
        Num = num;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
