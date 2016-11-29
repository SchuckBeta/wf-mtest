/**    
* @Project: wf-ptest-client 
* @Title: YYYYY 
* @Package www.wanfin.com.ptest.client.modules.cms.action 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年9月28日 下午6:35:52   
* @version V1.0.0   */ 
package www.wanfin.com.ptest.client.modules.cms.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import www.wanfin.com.ptest.api.modules.cms.entity.FileTpl;
import www.wanfin.com.ptest.api.modules.cms.service.IFileTplService;


/**   
 * @author Chenh  
 * @date 2016年9月28日 下午6:35:52 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
public class FileTplAction {

	private IFileTplService fileTplService;

	public IFileTplService getFileTplService() {
		return fileTplService;
	}

	public void setFileTplService(IFileTplService fileTplService) {
		this.fileTplService = fileTplService;
	}

	public void start() throws Exception {
		System.out.println("insertStr is Running!");
		FileTpl entity = new FileTpl();
		entity.setId("testid123456");
		entity.setRoot("/cxdd");
		entity.setFile("testfile.txt");
		String idStr = fileTplService.insertStr(entity);
		System.out.println("insertStr idStr is:"+idStr);
		System.out.println("insertStr is Run End!");
		System.out.println("insertStr is Running!");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			try {
				String hello = fileTplService.sayHello("world" + i);
				System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);

//				if (i % 10 == 0) {
//					List<BranchCompany> lbrans = (List<BranchCompany>) branService.getBranchCompanys();
//					BranchCompany fbran = (BranchCompany) lbrans.get(lbrans.size() - 1);
//					System.out.println(fbran.getId() + ": " + fbran.getLabId() + "-" + fbran.getRemark());
//				}
//
//				if (i % 8 == 0) {
//					String uuid = UUID.randomUUID().toString();
//					BranchCompany braCom = new BranchCompany();
//					braCom.setName("Hai");
//					braCom.setLabId(i);
//					braCom.setAddress("SSdsg");
//					braCom.setModuleNo("SSS2000");
//					braCom.setTelNumber("125604");
//					braCom.setRemark(uuid);
//					branService.saveBranchCompany(braCom);
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
		}
	}
}
