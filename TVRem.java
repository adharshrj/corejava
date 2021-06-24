interface TVRemote
{
   void tvdisplay();
}

interface SmartTVRemote extends TVRemote
{
    void smarttvdisplay();
}

class TV implements SmartTVRemote
{
    public void smarttvdisplay()
    {
        System.out.println("This is a Smart Remote for TV");
    }

    public void tvdisplay()
    {
        System.out.println("This is a TV Display");
    }
}

class TVRem{
    public static void main(String a[]) {
        TV tv= new TV();
        tv.smarttvdisplay();
        tv.tvdisplay();
        
    }
}