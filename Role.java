import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        int remindBlood = role.getBlood() - hurt;
        remindBlood = Math.max(remindBlood, 0);
        role.setBlood(remindBlood);

        System.out.println(this.getName() + "打了" + role.getName() + "一耳巴子，" + role.getName() + "还剩" + remindBlood + "点血");
    }
}
