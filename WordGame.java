public class WordGame {
    public static void main(String[] args) {
        Role role1 = new Role("A",100);
        Role role2 = new Role("B",100);

        while (true){
            role1.attack(role2);
            if (role2.getBlood() == 0){
                System.out.println(role1.getName() + "K.O了" + role2.getName());
                break;
            }
            role2.attack(role1);
            if (role1.getBlood() == 0){
                System.out.println(role2.getName() + "K.O了" + role1.getName());
                break;
            }
        }
    }
}
