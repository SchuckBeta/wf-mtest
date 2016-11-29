/**    
* @Project: wf-ptest-providers 
* @Title: YYYYY 
* @Package www.wanfin.com.ptest.providers.modules.cms.dao 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年9月28日 下午4:16:15   
* @version V1.0.0   */ 
package www.wanfin.com.ptest.providers.modules.cms.dao;

import www.wanfin.com.ptest.api.modules.cms.entity.FileTpl;

/**   
 * @author Chenh  
 * @date 2016年9月28日 下午4:16:15 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
public interface FileTplWDao {
	public int insert(FileTpl entity);
	public int update(FileTpl entity);
	public int delete(FileTpl entity);
	

	public String insertStr(FileTpl entity);
}
