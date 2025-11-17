public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        Zoo zoo = new Zoo();
        lion.name="symba";
        lion.age=2;
        lion.family="fLion";
        lion.isMammal=true;
        zoo.city="Tunis";
        zoo.name="zz";

        Animal cat = new Animal("FCat","mimi",2,true);
        Animal dog = new Animal("FDog","bobi",3,true);
        Zoo z1 = new Zoo("zizouu", "tunis",25);
        z1.display();
       // System.out.println(z1) ;
        //System.out.println(z1.toString()) ;
        //System.out.println(cat);
        //System.out.println(dog);
        System.out.println("***Prosit3***********");
       z1.addAnimal(cat);
       z1.addAnimal(dog);
        //System.out.println(z1);

        Animal mouse = new Animal("Mouse","sousou",3,true);

z1.addAnimal(mouse);
System.out.println(z1);
        System.out.println(z1.searchAnimal(mouse));
        System.out.println(z1.searchAnimal(lion));
Zoo z2 = new Zoo("zizouu", "tunis",25);
z2.addAnimal(lion);
Zoo z3 = new Zoo("z", "tunis",25);
        System.out.println(Zoo.comparerZoo(z1,z2));
    }
}
