package nttd.bootcamp.microservices.account.management.entity.enums;

public enum AccountType {
    SAVING_ACCOUNT("saving account") ,
    CURRENT_ACCOUNT("current account") ,
    FIXED_TERM("fixed term") ;

    private final String type;

    AccountType(String type) {
        this.type = type;
    }

}
