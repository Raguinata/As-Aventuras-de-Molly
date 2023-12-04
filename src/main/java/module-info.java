module com.example.mollyadventures {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mollyadventures to javafx.fxml;
    exports com.example.mollyadventures;
}