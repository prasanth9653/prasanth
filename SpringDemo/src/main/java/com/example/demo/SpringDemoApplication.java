package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cac=	SpringApplication.run(SpringDemoApplication.class, args);
	 ShoeShop ss=cac.getBean("ashop",ShoeShop.class);
	
	System.out.println(ss.sellshoe());
	}

}
abstract class shoe
{
	
}
class LeatherShoe extends shoe
{
	
	
}
class SportsShoe extends shoe
{
	
	
}
abstract class Factory
{
	public abstract shoe makeshoe();
}
@Component("gsf")
class GaneshShoeFactory extends Factory
{
	public GaneshShoeFactory() {
		System.out.println("Ganesh Shoe Factory Object cretaed");
	}
	public shoe makeshoe()
	{
		return new LeatherShoe();
	}
	
}
@Component("asf")
class AjithShoeFactory extends Factory
{
	public AjithShoeFactory() {
		System.out.println("Ajith Shoe factory cretaed");
	}
	public shoe makeshoe()
	{
		return new SportsShoe();
	}
	
}
abstract class ShoeShop
{
	@Autowired
	@Qualifier("asf")
	private Factory factory2;
	public Factory getFactory()
	{
		return factory2;
	}
	public void setFactory(Factory factory1)
	{
		 this.factory2=factory1;
	}
	public abstract shoe sellshoe();
	
}
@Component("ashop")
class AnoudShoeShop extends ShoeShop
{
	public AnoudShoeShop() {
		System.out.println("AnoudShoeShop1 object created");
	}
	@Override
	public shoe sellshoe() {
		
		System.out.println(getFactory());
		return getFactory().makeshoe();
	}
	
}