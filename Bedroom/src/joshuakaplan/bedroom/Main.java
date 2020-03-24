package joshuakaplan.bedroom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Bedroom bedroom = context.getBean("bedroom", Bedroom.class);
		
		System.out.println(bedroom.getLamp().use());
		System.out.println(bedroom.getLamp().use());
		System.out.println(bedroom.getWalls());
		System.out.println(bedroom.getFloor());
		
		context.close();
	}

}
