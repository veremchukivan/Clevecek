module ukf.sk.zobrazovanie_roznych_stavov_komponentu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ukf.sk.zobrazovanie_roznych_stavov_komponentu to javafx.fxml;
    exports ukf.sk.zobrazovanie_roznych_stavov_komponentu;
}