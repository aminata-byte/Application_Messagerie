module com.example.application_messagerie {
    // JavaFX
    requires javafx.controls;
    requires javafx.fxml;

    // Java SQL — nécessaire pour Hibernate
    requires java.sql;

    // JPA / Persistence
    requires java.persistence;

    // Hibernate
    requires org.hibernate.orm.core;

    // Jackson
    requires com.fasterxml.jackson.databind;

    // Logback
    requires org.slf4j;

    // BCrypt
    requires jbcrypt;

    // Ouvrir les packages à JavaFX et Hibernate
    opens com.example.application_messagerie to javafx.fxml;
    opens com.example.application_messagerie.utils to org.hibernate.orm.core;
    opens com.example.application_messagerie.entity to org.hibernate.orm.core;
    opens com.example.application_messagerie.client.controller to javafx.fxml;

    exports com.example.application_messagerie;


}