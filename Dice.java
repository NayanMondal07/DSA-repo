public class Dice {
    int roll(){
    double number = Math.random()*6;
    int currroll = (int)Math.ceil(number);
    return (int)Math.ceil(number);
}

    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i =1;i<10;i++){
        System.out.println(dice.roll());
        }
    }
}
    

