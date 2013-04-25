package quiz.one;

import com.polopoly.cm.app.policy.SingleValued;
import com.polopoly.cm.client.CMException;
import com.polopoly.render.CacheInfo;
import com.polopoly.render.RenderRequest;
import com.polopoly.siteengine.dispatcher.ControllerContext;
import com.polopoly.siteengine.model.TopModel;

import example.content.RenderControllerExtended;

public class RenderControllerQuiz1 extends RenderControllerExtended {

    @Override
    public void populateModelAfterCacheKey(RenderRequest request, TopModel m, CacheInfo cacheInfo, ControllerContext context) {
        super.populateModelAfterCacheKey(request, m, cacheInfo, context);

        m.getLocal().setAttribute("s", new SingleValued() {
            @Override
            public void setValue(String arg0) throws CMException {}
            
            @Override
            public String getValue() throws CMException {
                return "myString";
            }
        });
    }

}
