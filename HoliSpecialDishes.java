import java.util.Scanner;
class Ghujiya{
    
    Double flour;
    Double Sugar;
    Double Ghee;
    Double Raisins;
    Double Almonds;
    Double Cashew;
    Double khoya;
    Double clarified_Butter;
    Double Water;
    Double cardamom;
    double HydrationPercentage;
    char Addingflour;
    
    void holiInfo(){
        
        System.out.println("=================================================================");
        System.out.println("====================== Rango Waali Happy Holi ===================");
        System.out.println("=================================================================");
    }
    
    void takingIngradientsForDough(){
        System.out.println("\n\n\n\n\n\n=================================================================");
        System.out.println("============ For Dough Process (Taking Ingradients) =============");
        System.out.println("=================================================================");
        
        Scanner Ingredients = new Scanner(System.in);
        System.out.print("      Flour(Kg/Gm):   ");
        flour = Ingredients.nextDouble(); 
        System.out.print("      clarified_Butter(Gm):   ");
        clarified_Butter = Ingredients.nextDouble();
        System.out.print("      Water(lit):   ");
        Water = Ingredients.nextDouble();
    }
    
    void doughProcess(){
        Scanner Ingredients = new Scanner(System.in);
        HydrationPercentage = (Water / flour ) * 100;
        if(HydrationPercentage > 63){
            System.out.println("        Dough Spoiled(OverWettd)");
            System.out.println("Do You want to add Flour(y/n). ");
            Addingflour = Ingredients.next().charAt(0);
            if(Addingflour == 'y'){
                double flour = Ingredients.nextDouble();
                System.out.println("        Added successFully.");
                HydrationPercentage = (Water / flour +  flour ) * 100;
                if(HydrationPercentage < 63)
                {
                    System.out.println("\n\n\n\n        Dough Mixtured Successfully with water, clarified_Butter, Maida.");
                }
                else{
                    doughProcess();
                }
            }
            else{
                System.out.println("    Okh    ");

            }                
        }
        else{
            System.out.println("        \n\n\nDough Mixtured Successfully with water, clarified_Butter, Maida.");

        }
    }
        
    void takingIngradientsForFilling(){
        System.out.println("\n\n\n\n\n\n=================================================================");
        System.out.println("============ For Filling Process (Taking Ingradients) =============");
        System.out.println("=================================================================");
        
        Scanner Ingredients = new Scanner(System.in);
         
        System.out.print("      Ghee(/spoon):   ");
        Ghee = Ingredients.nextDouble();
        System.out.print("      Raisins(Gm):   ");
        Raisins = Ingredients.nextDouble();
        System.out.print("      Almonds(Gm):   ");
        Almonds = Ingredients.nextDouble();
        System.out.print("      Cashew(Gm):   ");
        Cashew = Ingredients.nextDouble();
        System.out.print("      Khoya(Gm):   ");
        khoya = Ingredients.nextDouble();        
        System.out.print("      Cardamom(Gm):   ");
        cardamom = Ingredients.nextDouble();  
        
    }
    
    void fillingProcess(){
        Scanner Ingredients = new Scanner(System.in);
        System.out.println(" \n\n\n\n 1. Saute the khoya over medium heat till it looks slightly fried. ");
        System.out.println(" 2. Taking the sugar, cardamom and almonds mix in Khoya.");
        System.out.print("      Sugar(20 gm/1000gmflour):   ");
        Sugar = Ingredients.nextDouble();
        double h = flour * 20 * 1000;
        if(Sugar ==  h){
            System.out.println(" Sugar, cardamom and almonds mixed Successfully.");
        }
        else {
            System.out.println(" Sugar, cardamom and almonds mixed Successfully But It is most sweet.");

        }
        System.out.println("\n\n\n\n Your Ghujiya is going to fry in Oil.");        
        System.out.println("\n\n\n\n Wait Sometime . and after Get Ready To eat .");        
    }
    
    
    void yourGhujiya(){
        Scanner GhujiyaFor = new Scanner(System.in);
        System.out.println("\n\n\n\n Howmany Ghujiaya You Want: ");
        int n = GhujiyaFor.nextInt();
        for (int j=1;j<=n;j++){
            System.out.println("\n Ghujiya ");
        }
        for (int j=1;j<=n;j++){
            System.out.println("\n Rango Waali .......   Khushiyo waali .......    Pyaar Waali  ");
            System.out.println("\n Colors fill your life with various joy and happiness. ");
            
            System.out.println("\n\n\n\n Happy Holi To You and all Your Family. ");
        }
        
    }
}

class HoliSpecialDishes{
    public static void main(String [] HappyHoli){
      Ghujiya ColorFullHoliDishes = new Ghujiya();
        ColorFullHoliDishes.holiInfo();
        ColorFullHoliDishes.takingIngradientsForDough();        
        ColorFullHoliDishes.doughProcess();
        ColorFullHoliDishes.takingIngradientsForFilling();
        ColorFullHoliDishes.fillingProcess();
        ColorFullHoliDishes.yourGhujiya();
    }
}