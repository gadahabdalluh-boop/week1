package aaaa.person2;

/**
 *
 * @author gadah
 */
public class Person2 {
    private String name;
    private int yaerOfbrith;

    public void setname(String name){
        this.name=name;
    }

    public String getname(){
        return name;
    }

    public void setyaerOfbrith(int yaerOfbrith){
        this.yaerOfbrith=yaerOfbrith;
    }

    public int getyaerOfbrith() {
        return yaerOfbrith;
    }

    public int getage(){
        return 2026 - yaerOfbrith;
    }

    public static void main(String[] args) {

        Person2 s1 = new Person();

        s1.setname("Ghada");

        s1.setyaerOfbrith(2004);

        System.out.println("Name: " + s1.getname());
        System.out.println("Age: " + s1.getage());
