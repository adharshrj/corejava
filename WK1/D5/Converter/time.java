package WK1.D5.Converter;

public class time {
    int type;
    double hr, min, sec, val;
    Scanner s = new Scanner(System.in);
    
    public void read(){
        System.out.println("Enter type");
        System.out.println("Hours");
        System.out.println("Minutes");
        System.out.println("Seconds");
        System.out.print("Enter option");

        type = Integer.parseInt(s.nextLine().trim());

        System.out.print("Enter Value");

        val = Double.parseDouble(s.nextLine().trim());
    }
    public void conversion(){
        System.out.println("Converting");
        switch(type){
            case 1: sec = val*3600;
            System.out.println("HR=" +val);
            System.out.println("SEC=" +mil);
            break;

            case 2: min = val*60;
            System.out.println("HR=" +val);
            System.out.println("MIN=" +inr);
            break;

            case 3:sec = val/3600;
                   min = val/60;
            System.out.println("HR=" +val);
            System.out.println("MIN=" +min);
            System.out.println("SEC=" +sec);
            break;
        }
    }
}
    
}
