package charactor;

//Weapon�����������ʹ�ñ������import
import property.Weapon;

public class Hero {
public	String name;
protected	float hp;
static String copyright;
	
	//װ��һ������
	//public void equip(Weapon w){
		//Hero h = new Hero();
	//		} 
public static void main(String[] args){
	Hero garen = new Hero();
	garen.name = "����";
	
	Hero.copyright = "��Ȩ�� Riot Games��˾����";
	
	System.out.println(garen.name);
	System.out.println(garen.copyright);
	
	Hero teemo = new Hero();

	System.out.println(teemo.name);
	System.out.println(teemo.copyright);
}

}
