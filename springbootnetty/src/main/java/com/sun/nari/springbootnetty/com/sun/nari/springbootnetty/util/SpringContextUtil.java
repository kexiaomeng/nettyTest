/**
 * SpringContext工具类
 */
package com.sun.nari.springbootnetty.com.sun.nari.springbootnetty.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 定义SpringContext工具,用于获取实例
 * @author FLOYD
 * @time 2016年5月18日下午11:17:53
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext context = null;
	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.context = applicationContext;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T getBean(String beanName) {
		return (T) context.getBean(beanName);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanName,Object object) {
		if (object == null) {
			return getBean(beanName);
		}
		return (T) object;	
	}
}
