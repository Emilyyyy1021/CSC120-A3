import java.util.*;

class Conversation {

  public static void main(String[] arguments) {
    Scanner sc = new Scanner(System.in);
    List<String> transcript = new ArrayList<String>();

    // random answers
    String[] arr = {"Wow", "Hmmmm", "Nice", "Tricky"};
    Random random = new Random();

    // Ask how many rounds 
    System.out.print("How many rounds?");
    
    int rounds = sc.nextInt();
    sc.nextLine();

    System.out.print("Hi there! What's on your mind?");
    transcript.add("Hi there! What's on your mind?");

    // main dialogue 
    for (int i = 1; i <= rounds; i++) {

      String answer = sc.nextLine();
      transcript.add(answer);

      if(answer.contains("I")|| answer.contains("you") || answer.contains("me") || answer.contains("am") || answer.contains("my")||answer.contains("your")){
        if(answer.contains("I")){
          answer = answer.replaceAll("\\bI\\b", "you");
          // System.out.println(answer);
        }

        if(answer.contains("me")){
          answer = answer.replaceAll("\\bme\\b", "you");
          // System.out.println(answer);
        }

        if(answer.contains("am")){
          answer = answer.replaceAll("\\bam\\b", "are");
          // System.out.println(answer);
        }

        if(answer.contains("you")){
          answer = answer.replaceAll("\\byou\\b", "I");
          // System.out.println(answer);
        }

        if(answer.contains("my")){
          answer = answer.replaceAll("\\bmy\\b", "your");
          // System.out.println(answer);
        }

        if(answer.contains("your")){
          answer = answer.replaceAll("\\byour\\b", "my");
          // System.out.println(answer);
        }
                  
          System.out.print(answer + "?");
          transcript.add(answer + "?");

      } else {
        // randomly selects an index from the arr
        int select = random.nextInt(arr.length);
        // prints out the value at the randomly selected index
        System.out.println(arr[select]);
        transcript.add(arr[select]);
      }

    }

    // close the scanner while done 
    sc.close();

    // goodbye message
    System.out.print("See ya!\n");
    transcript.add("See ya!\n");

    // print out transcript 
    System.out.println("\nTranscript:");
    for (String entry : transcript) {
    System.out.println(entry);
    }



  }
}



