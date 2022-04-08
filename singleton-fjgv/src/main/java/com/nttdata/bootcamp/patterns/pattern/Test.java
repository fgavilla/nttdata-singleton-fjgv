package com.nttdata.bootcamp.patterns.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.patterns.changeofresponsability.Unit;
import com.nttdata.bootcamp.patterns.singleton.Singleton;

@SpringBootApplication
public class Test{
	
	
	public static void main(String[] args) {
        //SpringApplication.run(Test.class, args);
		//USO DE SINGLETON
				System.out.println("-----MUESTRA DE DATOS DE OBJETO CREADO CON PATRON SINGLETON-----");
				Singleton.getInstance().setAge(20);
				Singleton.getInstance().setName("Francisco José");
				System.out.println(Singleton.getInstance());
				
				System.out.println("Me llamo " + Singleton.getInstance().getName() + " y tengo " + Singleton.getInstance().getAge() + " años");
				System.out.println("\n");
				
				//USO DE PROTOTYPE
				System.out.println("-----MUESTRA DE DATOS DE OBJETOS CREADOS CON PATRON PROTOTYPE-----");
				Person persona1 = Person.builder().age(30).name("Manolo").build();
				Person personaPrototype = persona1.clone();
				System.out.println("Me llamo " + persona1.getName() + " y mi dirección de memoria es " + persona1);
				System.out.println("Me llamo " + persona1.getName() + " y mi dirección de memoria es " + personaPrototype);
				System.out.println("\n");
				
				
				//PRUEBA DE CREAR OBJETO CON EL PATRON BUILDER
				System.out.println("-----MUESTRA DE DATOS DE OBJETOS CREADOS HACIENDO USO DEL PATRO BUILDER-----");
		  		Person personBuilder = Person.builder().age(45).name("Francisco Jos�").build();
		  		System.out.println("Nombre: " + personBuilder.getName());
		  		System.out.println("Edad: " + personBuilder.getAge());
		  		System.out.println("\n");
		  		
		  		//PRUEBA DEL USO DEL PATRON DECORATOR
		  		System.out.println("-----MUESTRA DE DATOS DE OBJETOS CREADOS HACIENDO USO DEL PATRO BUILDER-----");
		  		Person persona2 = new Person("Antonio", 46);
		  		PersonDecorator personaDecorator = new PersonDecorator(persona2);
		  		System.out.println(personaDecorator.getName());
		  		System.out.println(personaDecorator.getAge());
		  		System.out.println("\n");
		  		
		  		//PRUEBA DEL USO DEL PATRON PROXY
		  		System.out.println("-----MUESTRA DE DATOS DE OBJETOS CREADOS HACIENDO USO DEL PATRO BUILDER-----");
		  		PersonProxy personaProxy = new PersonProxy(persona1);
		  		personaProxy.operation();
		  		System.out.println("\n");
		  		
		  		//PRUEBA DEL USO DEL PATRON CHANGE OF RESPONSABILITY
		  		 Unit soldado = new Unit("soldado");
		         Unit sargento = new Unit("sargento", soldado);
		         Unit capitan = new Unit("capitan", sargento);
		         capitan.executeCommand("Accion");
			}
    }

		
