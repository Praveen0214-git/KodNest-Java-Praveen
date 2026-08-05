

public class P4 {

    public static void main(String[] args) {
        // int a = 10;
        // int b = a++ + ++a + a++ + a++ + ++a + a++;
        // System.out.println(a);
        // System.out.println(b);

        // for(int i=1;i<=5;i++){
        // System.out.println(i);
        // }

        // int i = 1;
        // while(i<=5){
        // System.out.println(i);
        // i++;

        // }

        // public class Main {
        // public static void main(String[] args) {
        // int day = 1;
        // int solvedProblems = 0;

        // while (day <= 3) {
        // if (day == 2) {
        // day++;
        // continue;
        // }
        // solvedProblems += 2;
        // System.out.println(
        // "Day " + day + ": " + solvedProblems);
        // day++;
        // }
        // int attempt = 1;
        // int mockScore = 64;

        // do {
        // mockScore += 3;
        // System.out.println(
        // "Attempt " + attempt + ": " + mockScore);

        // attempt++;
        // } while (mockScore < 70 && attempt <= 3);

        // System.out.println("Solved: " + solvedProblems);

        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName;

        switch (roundCode) {
            case 1:roundName = "Aptitude Round";
                
                break;
            case 2:roundName = " Technical Round";
               
                break;
            case 3:roundName = " HR Round";
              
                break;
            case 4:
            case 5:roundName = " Final Review";
          
                break;
            default:roundName = " Invalid Round";
      
        }
            String Attemptstatus = (attemptsUsed < maxAttempts) ? "Attempt Available" : "Attempt Limit Reached";

            System.out.println("Current Status: "+ roundName);
            System.out.println("Attempt: "+ Attemptstatus);

      
    }
}
    