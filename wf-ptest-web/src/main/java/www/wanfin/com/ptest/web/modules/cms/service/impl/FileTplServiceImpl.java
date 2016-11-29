/**    
 * @Project: wf-ptest-web 
 * @Title: YYYYY 
 * @Package www.wanfin.com.ptest.web.modules.cms.service.impl 
 * @Description [[_XXXXX_]]文件
 * @author Chenh 
 * @date 2016年9月28日 下午3:59:23   
 * @version V1.0.0   */
package www.wanfin.com.ptest.web.modules.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import www.wanfin.com.ptest.api.modules.cms.entity.FileTpl;
import www.wanfin.com.ptest.api.modules.cms.service.IFileTplService;
import www.wanfin.com.ptest.web.modules.cms.dao.FileTplRDao;
import www.wanfin.com.ptest.web.modules.cms.dao.FileTplWDao;

/**
 * @author Chenh
 * @date 2016年9月28日 下午3:59:23
 * @Description [[_XXXXX_]] YYYYY类 此处注解在Spring-Dubbo.xml文件中用到： <!--声明需要暴露的服务接口
 *              -->
 *              <dubbo:serviceinterface="com.ouc.service.BranchCompanyService"
 *              ref="braComService"/>
 * 
 */
@Service("fileTplService")
public class FileTplServiceImpl implements IFileTplService {
	@Resource
	FileTplRDao fileTplRDao;
	@Resource
	FileTplWDao fileTplWDao;

	public String insertStr(FileTpl entity) {
		return fileTplWDao.insertStr(entity);
	}

	public int insert(FileTpl entity) {
		return fileTplWDao.insert(entity);
	}

	public int update(FileTpl entity) {
		return fileTplWDao.update(entity);
	}

	public int delete(FileTpl entity) {
		return fileTplWDao.delete(entity);
	}

	public FileTpl get(FileTpl entity) {
		return fileTplRDao.get(entity);
	}

	public List<FileTpl> findList(FileTpl entity) {
		return fileTplRDao.findList(entity);
	}

	public List<FileTpl> findAllList() {
		return fileTplRDao.findAllList();
	}

	public String sayHello(String name) {
		return "Hello "+name;
	}
}
