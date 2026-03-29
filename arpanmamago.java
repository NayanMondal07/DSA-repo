public class arpanmamago {
    public static void main(String[] args) {
        arpan a1 = new arpan();
        a1.setbehaviour("very bad behaviour sudhu bakhan dai ar lokar kacha gal khai");
        System.out.println(a1.behaviour);
        a1.setcolor("kukur ar moto kalo arpan ondo kar a dakha jai na sour ar baccha ta ka");
        System.out.println(a1.color);
        a1.setculture("khub osikhito mamago kono kajar na ");
        System.out.println(a1.culture);
        a1.setlooks("kono maya patta dai na sobbai block kora dai mamago ka kono laj lojja na sudhu maya diga disturbr kora ar aja baja message kora ");
        System.out.println(a1.looks);
        a1.setbodylanguage("khub kharap body language bhikare moto rastai bosla bhikka kao da na sour ar baccha ta ka ");
        System.out.println(a1.bodylanguage);
    }

    
}
class arpan{
    String color;
    String behaviour;
    String culture;
    String looks;
    String bodylanguage;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void setbehaviour(String newbehaviour){
        behaviour = newbehaviour;
    }
    void setculture(String newculture){
        culture = newculture;
    }
    void setlooks(String newlooks){
        looks = newlooks;
        
    }
    void setbodylanguage(String newbodylanguage){
        bodylanguage = newbodylanguage;
    }
}
