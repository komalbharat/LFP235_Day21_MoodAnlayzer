//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//parameter and return Happy or Sad Mood
//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//        parameter and return Happy or Sad Mood
package bridgelabz.com;
public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {///create parameterize const
        this.message = message;
    }

    public String analyseMood(String message){ ///create parameterize const
        this.message = message;
        return analyseMood();
    }

    public String analyseMood(){


            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
}
