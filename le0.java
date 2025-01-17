/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class le0

{
    String name;
    int age;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
	public static void main(String[] args) {
	    
	    Main m1 = new Main();
	    m1.setAge(21);
	    m1.setName("Naman");
		System.out.println(m1.getName()+" "+m1.getAge());
	}
}