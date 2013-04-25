package quiz.four;

import example.content.ContentBasePolicy;

public class B extends ContentBasePolicy implements A {
    public boolean isVisible() {
        return true;
    }
}
