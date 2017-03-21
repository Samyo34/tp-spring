package main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import services.App;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context2 = new AnnotationConfigApplicationContext(App.class);
		App apptest = (App)context2.getBean("app");
		apptest.setNom("tototototot");
		System.out.println("Object: " + apptest.getNom());
		try { apptest.delete("totot");} catch (Exception e) { e.printStackTrace(); }
		try { apptest.delete(null);} catch (Exception e) { e.printStackTrace(); }
		try { apptest.save("toto");} catch (Exception e) { e.printStackTrace(); }

	}

}
