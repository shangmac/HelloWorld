package charactor;

//Weapon类中其他包里，使用必须进行import
import property.Weapon;

public class Hero {
public	String name;
protected	float hp;
static String copyright;
	
	//装备一把武器
	//public void equip(Weapon w){
		//Hero h = new Hero();
	//		} 
public static void main(String[] args){
	Hero garen = new Hero();
	garen.name = "盖伦";
	
	Hero.copyright = "版权有 Riot Games公司所有";
	
	System.out.println(garen.name);
	System.out.println(garen.copyright);
	
	Hero teemo = new Hero();

	System.out.println(teemo.name);
	System.out.println(teemo.copyright);
}

}
