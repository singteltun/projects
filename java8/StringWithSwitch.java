public class StringWithSwitch {
  public static void main(String args[]) {
    StringWithSwitch s = new StringWithSwitch();
    s.printDay("Tuesday");
  }

  public void printDay(String dayOfWeek) {
    switch(dayOfWeek) {
      case "Monday" : System.out.println("Monday"); break;
      case "Tuesday" : System.out.println("Tuesday"); break;
      case "Wednesday" : System.out.println("Wednesday"); break;
      case "Thursday" : System.out.println("Thursday"); break;
      case "Friday" : System.out.println("Friday"); break;
      case "Saturday" : System.out.println("Saturday"); break;
      case "Sunday" : System.out.println("Sunday"); break;
      default: System.out.println("Error : " + dayOfWeek + " is not a day of the week."); break;
    }
  }
}
