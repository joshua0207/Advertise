package tw.com.atomic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableScheduling
@EnableTransactionManagement
//@ServletComponentScan(basePackages="tw.com.atomic")
@SpringBootApplication(scanBasePackages= {"tw.com.atomic"})
//public class ApplicationContext extends SpringBootServletInitializer{
public class ApplicationContext{

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContext.class, args);
	}

}
