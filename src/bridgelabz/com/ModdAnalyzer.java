//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//parameter and return Happy or Sad Mood
package bridgelabz.com;
public class ModdAnalyzer {

    private String message;

    public ModdAnalyzer(String message) { //parametrised Constructor
        this.message = message;
    }

    public String analyseMood() { //display the message

            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }

        }


