package tracy.spring.event;

import org.springframework.context.ApplicationEvent;

public class MyEevent extends ApplicationEvent{

	private String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyEevent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
