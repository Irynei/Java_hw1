package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;
}
