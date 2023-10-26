public class MadLib {
    public static void main(String [] args){
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }//main method

    public MadLib(){
        System.out.println("halo varld");
        String classmate ="Clare";
        String city = "Boston";
        String noun = "dog";
        String adjective = "pretty";
        String pluralNoun = "shoes";
        String pluralAnimal = "dolphins";
        boolean trueOrFalse = false;
        double decimalBiggerThan1  = 1.5;
        int number1 = 5;
        int number2 = 15;
        int wholeNumberBetween1And4 = 3;
        String miltonTeacher = "Madame Huughe";
        String miltonDean = "Mr. Ruiz";
        String letterGrade = "A";
        String season = "Winter";

        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";
        System.out.println(story);









    }//constructor method

}
