package Akshay;

public class starter extends Food_Ordering {

	public static void main(String[] args) {
		starter();
	}
	public static void starter()
	{
		A="Chicken Chilly";
		B="Chicken Crispy";
		C="Chicken Shanghai";
		D="Chicken Maharaja";
		pr1=350;
		pr2=350;
		pr3=350;
		pr4=350;
		System.out.println("STARTERS");
		System.out.println("Item A:"+A+"\tRs."+pr1);
		System.out.println("Item B:"+B+"\tRs."+pr2);
		System.out.println("Item C:"+C+"\tRs."+pr3);
		System.out.println("Item D:"+D+"\tRs."+pr4);
		select_menu_item();
	}

}
