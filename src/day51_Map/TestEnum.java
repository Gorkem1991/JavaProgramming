package day51_Map;

public class TestEnum {
    public static void main(String[] args) {

      //  String browser ="Wooden Spoon";
        Browser browser =Browser.CHROME;

        switch (browser)
        {
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }

        Season season1 = Season.SUMMER;
        Season season2 = Season.FALL;
        Season season3 = Season.WINTER;
        Season season4 = Season.SPRING;

    }
}
