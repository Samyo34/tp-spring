package services;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan

public class App {

	private String nom;
	private Integer id;
	
	
		public App(){
			// System.out.println("start created");
		}


		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
		
		
		public void save(String string){
			System.out.println(string +" save fonction ");
		}
		public void delete(String del) {
			System.out.println("delete ");
			
		}
}
