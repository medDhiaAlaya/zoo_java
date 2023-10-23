package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

      Aquatic a=new Aquatic("poisson","Sardine",2,true,"Sea");

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);






        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

       

//instruction 27
        myZoo.swim();
        //instruction 28
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
//instruction 29
        System.out.println(myZoo.maxPenguinSwimmingDepth());
//instruction 30
myZoo.displayNumberOfAquaticsByType();
//instruction 31
System.out.println(aquatic.equals(a)); // oui affiche true car aquatic et a2 ont le meme nom, le même âge et vivent dans le même habitat.
        System.out.println(aquatic.equals(dolphin)); //affiche false car les attributs nom,age et habitat sont differents

}}
