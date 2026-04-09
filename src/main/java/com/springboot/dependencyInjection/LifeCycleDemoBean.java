package com.springboot.dependencyInjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.springboot.dependencyInjection.controllers.MyController;
import com.springboot.dependencyInjection.controllers.Myi18NController;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware
,ApplicationContextAware,BeanPostProcessor{
	
	//INITIALIZATION

	public LifeCycleDemoBean() {
		super();
		System.out.println("I'm in the Lifecycle constructor");
	}
	
	private String javaVer;

	@Value("${java.specification.version}")
	public void setJavaVer(String javaVer) {
		this.javaVer = javaVer;
		System.out.println("#1 propertySet java ver :"+this.javaVer);
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("#2 Beannameaware bean name is :"+ name);
		
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("#3 BeanfactoryAware - bean factory has set");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("#4 ApplicationContextAware - it has been set");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("#5 postConstruct it has been anotated method it has been called");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("#6 afterPropertiesSet populate propertie the lifecycleBean has it priorities");
		
	}
	
	//DESTROY
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("#7 in the @PreDestroy annotation has been called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("#8 disposableBean destroy the lifecycle bean has been terminated");
		
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName)  throws BeansException{
		System.out.println("#9 postProcessBeforeInitalization: "+beanName);
		
		if(bean instanceof MyController) {
			MyController demoBean = (MyController)bean;
			System.out.println("Calling Before init");
			demoBean.beforeInit();
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName)  throws BeansException{
		System.out.println("#10 postProcessAfterInitalization: "+beanName);
		if(bean instanceof MyController) {
			MyController demoBean = (MyController)bean;
			System.out.println("Calling After init");
			demoBean.AfterInit();
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	
}
