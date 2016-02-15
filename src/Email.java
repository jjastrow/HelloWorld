/**
 * Created by zach on 2/15/16.
 */
public class Email implements Comparable {
    String destination;
    String subject;
    String body;

    public Email(String destination, String subject, String body) {
        this.destination = destination;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public int compareTo(Object o) {
        Email e = (Email) o;
        return destination.compareTo(e.destination);
    }

    @Override
    public String toString() {
        return "Email{" +
                "destination='" + destination + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
