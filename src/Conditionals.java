public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }//main method

    public Conditionals (){
        String question= "Do you like dogs?";
        System.out.println(question);
        int randomInt=(int)(Math.random()*11);
        if (randomInt<1){
            System.out.println("Yes!");
        } else if (randomInt<2 && randomInt>0){
            System.out.println("No.");
        } else if (randomInt<3 && randomInt>1){
            System.out.println("Better not tell you now.");
        } else if (randomInt<4 && randomInt>2){
            System.out.println("Perhaps.");
        } else if (randomInt<5 && randomInt>3){
            System.out.println("In the distant future...");
        } else if (randomInt<6 && randomInt>4){
            System.out.println("Surely.");
        } else if (randomInt<7 && randomInt>5){
            System.out.println("Most definitely not.");
        } else if (randomInt<8 && randomInt>6){
            System.out.println("Maybe.");
        } else if (randomInt<9 && randomInt>7){
            System.out.println("Absolutely.");
        } else if (randomInt<10 && randomInt>8){
            System.out.println("It's very doubtful.");
        } else if (randomInt<11 && randomInt>9){
            System.out.println("As I see it, yes.");
        }
    }//constructor method

}

