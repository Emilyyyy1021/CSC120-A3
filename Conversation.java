import java.util.*;

/**
 * A chatbot that will run in chosen rounds and reply according to the input 
 */
class Conversation {

  // Mirror word function
//   private static String mirrorWord(String word) {
//   switch (word) {
//       case "I": return "you";
//       case "me": return "you";
//       case "am": return "are";
//       case "are": return "am";
//       case "you": return "I";
//       case "my": return "your";
//       case "your": return "my";
//       default: return word;
//     }
// }

/**
 * the main function that runs a number of rounds of conversation
 * turns accepting input from the user and printing responses
 */
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

    // greetings
    System.out.print("Hi there! What's on your mind?");
    transcript.add("Hi there! What's on your mind?");

    // turns accepting input from the user and printing responses
    for (int i = 1; i <= rounds; i++) {

      String answer = sc.nextLine();
      transcript.add(answer);

      String new_answer= new String();

      if(answer.contains("I")|| answer.contains("you") || answer.contains("me") || answer.contains("am") || answer.contains("my")||answer.contains("your")){
        
        //method 1
        // // Apply transformations using mirrorWord function
        // String[] words = answer.split("\\s");
        // StringBuilder mirroredAnswer = new StringBuilder();

        // for (String word : words) {
        //     mirroredAnswer.append(mirrorWord(word)).append(" ");
        // }

        // System.out.print(mirroredAnswer.toString().trim() + "?");
        // transcript.add(mirroredAnswer.toString().trim() + "?");

        // method 2
        //  Apply transformations
         if(answer.contains("I")){
          new_answer = answer.replaceAll("\\bI\\b", "you");
          // System.out.println(answer);
        }

         if(answer.contains("me")){
          new_answer = new_answer.replaceAll("\\bme\\b", "you");
          // System.out.println(answer);
        }

         if(answer.contains("am")){
          new_answer = new_answer.replaceAll("\\bam\\b", "are");
          // System.out.println(answer);
        }

         if(answer.contains("are")){
          new_answer = new_answer.replaceAll("\\bare\\b", "am");
          // System.out.println(answer);
        }

         if(answer.contains("you")){
          new_answer = new_answer.replaceAll("\\byou\\b", "I");
          // System.out.println(answer);
        }

         if(answer.contains("my")){
          new_answer = new_answer.replaceAll("\\bmy\\b", "your");
          // System.out.println(answer);
        }

         if(answer.contains("your")){
          new_answer = new_answer.replaceAll("\\byour\\b", "my");
          // System.out.println(answer);
        }
                  
          System.out.println(new_answer + "?");
          transcript.add(new_answer + "?");

      } else {
        // randomly selects an index from the array list
        int select = random.nextInt(arr.length);
        // prints out the value at the randomly selected index
        System.out.println(arr[select]);
        transcript.add(arr[select]);
      }

    }

    // close the scanner while done 
    sc.close();

    //goodbye message
    System.out.println("See ya!\n");
    transcript.add("See ya!\n");


    //print out the transcript of the chat
    System.out.println("\nTranscript:");
    for (String entry : transcript) {
    System.out.println(entry);
    }



  }
}



