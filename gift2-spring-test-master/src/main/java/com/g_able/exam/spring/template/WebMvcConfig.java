package com.g_able.exam.spring.template;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

@Configuration
@EnableWebMvc
@EntityScan("com.g_able.exam.spring.tamplate.app.model")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	@Override
	public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

	@Bean
	public JasperReportsViewResolver getJasperReportsViewResolver() {

		JasperReportsViewResolver resolver = new JasperReportsViewResolver();
		resolver.setPrefix("classpath:jasperreports/");
		resolver.setSuffix(".jrxml");

		resolver.setReportDataKey("datasource");
		resolver.setViewNames("*rpt_*");
		resolver.setViewClass(JasperReportsMultiFormatView.class);
		resolver.setOrder(0);
		return resolver;
	}

	@Bean
	public ViewResolver htmlViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/pages/");
		resolver.setSuffix(".html");
		resolver.setOrder(1);
		return resolver;
	}
}
