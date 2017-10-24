package never_use_switch;

public class Main {
    public static void main(String [] args) {
        Client client = new Client("Irko", 22);
        MailCodeFirstType mailCodeFirst = new MailCodeFirstType();
        MailCodeSecondType mailCodeSecond = new MailCodeSecondType();
        MailInfo mailInfoFirst = new MailInfo(client, mailCodeFirst);
        MailInfo mailInfoSecond = new MailInfo(client, mailCodeSecond);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfoFirst);
        mailSender.sendMail(mailInfoSecond);
    }
}
