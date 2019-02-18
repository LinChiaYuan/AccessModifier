/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/package Human;

import biological.Creater;

public class Man extends Creater
{
    private String Skill = "";

    private  int count =10;

    public Man()
    {

    }

    public Man(int num, String name, int blood, int money, String skill)
    {
        super(num, name, blood, money);
        Skill = skill;
    }

    public void Dothing()
    {
        blood = 100;
        money = 100 ;
        setNum(10);
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
