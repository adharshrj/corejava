package srmb2corejava.WK1.D7;

interface Mathematics<T extends Number> {
    
    int powerOf(T t);
}

class PowerOfThree<T extends Number> implements Mathematics<T>{
    
    public int powerOf(T i){
        
        return i.intValue()*i.intValue()*i.intValue();
    }
}

class geninterfaceapp {
    public static void main(String[] args) {
        
        PowerOfThree<Float> pthree = new PowerOfThree<Float>();
        System.out.println("5^3 -> "+pthree.powerOf(5f));
    }
}


