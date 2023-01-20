package bridgelabz.com;
//conditions to verify the expected result
import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;

public class TestMoodAnalyzer {

    @Test
    //this is method
    public void givenMessgae_WhenSad_ShouldReturn_Sad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
