/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
package biological;

public class Dog extends Creater
{
    private String Skill = "";

    public Dog(int num, String name, int blood, int money, String skill)
    {
        super(num, name, blood, money);
        Skill = skill;
    }

    public void Dothing()
    {
        blood = 100;
        money = 100 ;
        Name = "笨狗";
        setNum(10);
    }
}
