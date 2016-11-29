/**    
* @Project: wf-ptest-web 
* @Title: YYYYY 
* @Package www.wanfin.com.ptest.web.modules.cms.controller 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年9月29日 下午1:33:58   
* @version V1.0.0   */ 
package www.wanfin.com.ptest.web.modules.cms.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**   
 * @author Chenh  
 * @date 2016年9月29日 下午1:33:58 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
@Controller
public class FileTplController {
	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(FileTplController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return VIEW_INDEX;

	}
}