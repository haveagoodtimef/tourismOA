package tourism;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fhz.dao.ProjectDao;
import com.fhz.entity.Project;

public class demo {
	
	
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
		ProjectDao pd = ac.getBean("projectDao",ProjectDao.class);
		
		List<Project> list = pd.findObjects();
		System.out.println(list);
	}
}
