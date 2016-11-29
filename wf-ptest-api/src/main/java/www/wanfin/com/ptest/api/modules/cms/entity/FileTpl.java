package www.wanfin.com.ptest.api.modules.cms.entity;

import java.io.Serializable;

/**
 * User: chenh
 * Date: 16-09-28
 * Time: 上午9:44
 */
public class FileTpl implements Serializable{
    private String id;
    private String file;
   	private String root;// 应用的根目录

	public FileTpl() {
		super();
	}
	
   	public FileTpl(String file, String root) {
   		this.file = file;
   		this.root = root;
   	}

	public FileTpl(String id, String file, String root) {
		super();
		this.id = id;
		this.file = file;
		this.root = root;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}
}