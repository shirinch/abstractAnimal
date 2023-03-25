public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Bibi",123,'f',10);
        Cow cow2 = new Cow("Lil",100,'m',18);
        Cow cow3 = new Cow("Ubi",130,'m',15);
        Cow cow4 = new Cow("Iki",49,'f',4);
        Cow cow5 = new Cow("Pepe",89,'m',8);
        Cow cow6 = new Cow("Lola",100,'f',15);
        Cow[]cows={cow1,cow2,cow3,cow4,cow5};
        Cow[]cows1 = {cow6};
        Sheep sheep1 = new Sheep("Mimi",78,'m',11);
        Sheep sheep2 = new Sheep("Kiki",90,'f',29);
        Sheep sheep3 = new Sheep("Luna",88,'m',9);
        Sheep sheep4 = new Sheep("Luci",66,'f',4);
        Sheep[]sheeps ={sheep1,sheep2,sheep3,sheep4};
        Sheep[]sheeps1={sheep4};
        Horse horse1 = new Horse("Inna",90,16,'m',"Black");
        Horse horse2 = new Horse("Dori",180,22,'f',"Grey");
        Horse horse3 = new Horse("Polly",130,20,'m',"White");
        Horse[]horses={horse1,horse2,horse3};
        Horse[]horses1={horse2};
        Farm farm1 = new Farm("Cholpon Ata",cows,horses,sheeps,"Jake");
        Farm farm2 = new Farm("Bishkek",cows1,horses1,sheeps1,"Harry");

        Animal[]animals={cow1,cow2, cow3, cow4, cow5, cow6, horse1,horse2,horse3,
        sheep2,sheep1, sheep3,sheep4};
        for (Animal h: animals) {
            System.out.println(h);
        }

        System.out.println("информация о 1 ферме ");
        System.out.printf("     %s     %s     %s     %s     %s  ",farm1.getAddress(),
                cows[0].getNickName(),horses[0].getNickName()
                ,sheeps[0].getNickName(),farm1.getOwnerName());
        System.out.printf("     %s     %s     %s\n",cows[1].getNickName(),horses[1].getNickName(),sheeps[1].getNickName());
        System.out.printf("    %s     %s     %s\n",cows[2].getNickName(),horses[2].getNickName(),sheeps[2].getNickName());
        System.out.printf("     %s    %s\n",cows[3].getNickName(),sheeps[3].getNickName());


        System.out.println("  информация о 2 ферме ");
        System.out.printf("     %s     %s     %s     %s     %s ",farm2.getAddress(),cows1[0].getNickName(),
                horses1[0].getNickName(), sheeps1[0].getNickName(),farm2.getOwnerName());
    }
}