public class Flower {
    String name;
    int price;
    String color;
    public void getFlowerPrice(Flower[]flowers){
        int max=0;
        for (Flower massive:flowers) {
            if(massive.price>max){
                max=massive.price;

            }
        }
        System.out.println("Max price: "+max);

    } public void getFlowerRan(Flower[]flowers){
        int countR = 0;
        int countT=0;
        for (Flower massiveFlow:flowers) {
            if(massiveFlow.name.equals("Roza")){
                countR++;
            } else if (massiveFlow.name.equals("Tulpan")) {
                countT++;
            }
        }
        System.out.println("Rozanyn sany: "+countR);
        System.out.println("Tulpandyn sany: "+countT);
        int index= 0;
        Flower[]roza=new Flower[countR];
        for (int i = 0; i < flowers.length ; i++) {
       if (flowers[i].name.equals("Roza")){
           roza[index]=flowers[i];

           System.out.print(roza[index].name+" ");
           System.out.print(roza[index].color+" ");
           System.out.print(roza[index].price+" ");
           System.out.println(" ");
           index++;
       }


        }
        Flower[]tulpan=new Flower[countT];
        int index1=0;
        for (int i = 0; i < flowers.length; i++) {
            if(flowers[i].name.equals("Tulpan")){
               tulpan[index1]=flowers[i];
                System.out.print(tulpan[index1].name+" ");
                System.out.print(tulpan[index1].color+" ");
                System.out.print(tulpan[index1].price+" ");
                System.out.println(" ");
                index1++;
            }

            }

    }
}
