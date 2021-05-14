public class dateFashion {
    public static void main(String[] args) {

    }

    public String alarmClock(int day, boolean vacation) {
        if (!vacation)
        {
            if  (day >=1 && day <=5)
            {
                return "7:00";
            }
            else if(day ==6 && day ==0)
            {
                return "10:00";
            }
            else
            {
                return "invalid";
            }
        }
        else
        {
            if (day >=1 && day <=5)
            {
                return "10:00";
            }
            else
            {
                return "off";
            }
        }
    }

}





