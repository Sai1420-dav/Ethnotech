class Sportsman{
    String Player_name;
    String Game_play;
    int age;
    int Total_cups;
    String place;

    public Sportsman(String pn,String G,int a,int T,String p) {
        Player_name=pn;
        Game_play=G;
        age=a;
        Total_cups=T;
        place=p;
    }
    
    void details(){
        System.out.println("--------The details of the player---------");
        System.out.println("Name:"+Player_name);
        System.out.println("Age:"+age);
        System.out.println("Place:"+place);
    }
    void play(){
        System.out.println("The player plays: "+Game_play);
    }
    void acheivements(){
        System.out.println("The no.of cups acheived by player is: "+Total_cups);
    }

}
class Main11{
    public static void main(String[] args) {
        Sportsman MS_Dhoni = new Sportsman("MS DHONI","CRICKET",43,11,"Ranchi");
        MS_Dhoni.details();
        MS_Dhoni.play();
        MS_Dhoni.acheivements();
    }
}