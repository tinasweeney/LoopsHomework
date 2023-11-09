public class Loops {
    public static void main(String[] args) {
        Loops myHW = new Loops();
    }

    public Loops() {
        //call my methods in here
        //you can comment it out while working on other methods
        countUp();
        countByThrees();
        countDown();
    }//end of Loops method

    public void countUp() {
        //put your loop code in here
        for (int f = 1; f < 6; f = f + 1) {
                System.out.println(f);
            }
    }
    public void countByThrees(){
        for (int x=3; x<16; x=x+3){
            System.out.print(x +" ");
        }
        System.out.println(" ");
    }
    public void countDown(){
        for (int y=10; y>0; y=y-1){
            System.out.print(y+", ");
        }
        System.out.println("Happy Loop Year!");
    }

}//end of Loops class