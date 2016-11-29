package www.wanfin.com.ptest.api.modules.cms.service;

import java.util.List;

import www.wanfin.com.ptest.api.modules.cms.entity.FileTpl;

/**
 * User: chenh
 * Date: 16-9-28
 * Time: 下午4:56
 */
public interface IFileTplService {
	public String insertStr(FileTpl entity);
	public int insert(FileTpl entity);
	
	public int update(FileTpl entity);
	
	public int delete(FileTpl entity);
	
	public FileTpl get(FileTpl entity);

	public List<FileTpl> findList(FileTpl entity);

	public List<FileTpl> findAllList();

	public String sayHello(String name);
}
