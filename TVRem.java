interface TVRemote
{
   void tvdisplay();
}

interface SmartTVRemote:TVRemote
{
    void smarttvdisplay();
}

class TV implements SmartTVRemote
{
    public void smarttvdisplay()
    {
        System.out.println("This is a Smart Remote for TV");
    }
}

class TVRem{
    public static void main(String a[]) {
        SmartTVRemote st= new SmartTVRemote();
        st.smarttvdisplay();
        
    }
}