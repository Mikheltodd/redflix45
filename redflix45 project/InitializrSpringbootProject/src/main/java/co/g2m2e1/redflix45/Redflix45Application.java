package co.g2m2e1.redflix45;

import co.g2m2e1.redflix45.views.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("co.com.g2m2e1.redflix45")
public class Redflix45Application {

	public static void main(String[] args) {
		new MainFrame().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            SpringApplication.run(Redflix45Application.class, args);
        }

}
