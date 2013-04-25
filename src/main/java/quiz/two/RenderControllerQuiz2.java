package quiz.two;

import com.polopoly.render.CacheInfo;
import com.polopoly.render.RenderRequest;
import com.polopoly.siteengine.dispatcher.ControllerContext;
import com.polopoly.siteengine.model.TopModel;

import example.content.RenderControllerExtended;

public class RenderControllerQuiz2 extends RenderControllerExtended {

    @Override
    public void populateModelAfterCacheKey(RenderRequest request, TopModel m, CacheInfo cacheInfo, ControllerContext context) {
        super.populateModelAfterCacheKey(request, m, cacheInfo, context);

        String[] array = {"one", "two"};
        m.getLocal().setAttribute("a", array);
    }

}
