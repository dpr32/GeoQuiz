package dpr32.geoquiz;

/**
 * Created by Devan on 7/10/2017.
 */
public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResID, boolean answerTrue)
    {
        mTextResID = textResID;
        mAnswerTrue = answerTrue;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
