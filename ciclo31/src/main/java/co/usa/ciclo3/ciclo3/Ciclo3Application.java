package co.usa.ciclo3.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"co.usa.ciclo3.ciclo3.model"})/*donde buscar las clases que son entidades (TABLAS DE bases de datos)*/
@SpringBootApplication
public class Ciclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
