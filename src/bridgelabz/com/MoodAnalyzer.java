//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//parameter and return Happy or Sad Mood
//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//        parameter and return Happy or Sad Mood
package bridgelabz.com;
public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {//parameterised cont
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) //it will check if null the throw this type
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL, "Please enter Proper Mood");
        }
    }
}