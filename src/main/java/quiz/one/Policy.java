package quiz.one;

import com.polopoly.cm.app.policy.SingleValuePolicy;
import com.polopoly.cm.client.CMException;
import com.polopoly.model.ModelTypeDescription;

import example.content.ContentBasePolicy;

public class Policy extends ContentBasePolicy implements ModelTypeDescription {
    public SingleValuePolicy getS2() throws CMException {
        return (SingleValuePolicy) getChildPolicy("s");
    }
}
