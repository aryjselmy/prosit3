public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBRCAGES=25;
     int nbrAnimal=0;
    //constructeur par defaut
public Zoo() {}
    //Constructeur parametré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;

        animals = new Animal[NBRCAGES];
    }
    public void display(){
    System.out.println("Nom : " + name + "\n " + "City : " +city + "\n "
            +"Nombre de cages : "+ NBRCAGES);}

   @Override
            public String toString(){
String s1,s2="";
    s1= "Nom : " + name + "\n " + "City : " +city + "\n "
                +"Nombre de cages : "+ NBRCAGES;
    for(int i=0;i<nbrAnimal;i++){
        s2+=animals[i].toString() + "\n";
    }



    return s1+"\n" + s2;
        }

public boolean addAnimal(Animal a) {
    if(nbrAnimal>= NBRCAGES){
        System.out.println("le nombre a dépassé la capacité ");
        return false;
    }
    if (searchAnimal(a) == -1) {
        animals[nbrAnimal] = a;
        nbrAnimal++;
        return true;
    }else{
    System.out.println("l'animal existe déja !!");
    return false;
}}

public int searchAnimal(Animal a){
    int indice=-1;
    for(int i=0;i<nbrAnimal;i++){
        if(animals[i].name==a.name){
            indice=i;
        }

    }
return indice;
}
public boolean removeAnimal(Animal a){
    int indice=searchAnimal(a);
    if(indice!=-1){
        for(int i=indice;i<nbrAnimal;i++){
            animals[i]=animals[i+1];
        }
        animals[nbrAnimal-1]=null;
        nbrAnimal--;
        return true;
    }
    return false;
}
public boolean isFull(){
    if(nbrAnimal==NBRCAGES){
        return true;
    }
    return false;
}
public static Zoo comparerZoo(Zoo z1,Zoo z2){
    if(z1.nbrAnimal>=z2.nbrAnimal){
        return z1;
    }
    return z2;
}

}
