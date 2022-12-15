package BehavioralPatterns.Template;

public class TemplateRunner {
    public static void main(String[] args) {
        BankWebsiteTemplate newsPage = new NewsPage();
        BankWebsiteTemplate personalCabinetPage = new PersonalCabinetPage();

        newsPage.showPage();
        System.out.println("------------------");
        personalCabinetPage.showPage();
    }
}
