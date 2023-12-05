module es.ieslosmontecillos.appusoselector {
    requires javafx.controls;
    requires javafx.fxml;

    requires es.ieslosmoncecillos.componenetes_plazaraul;
    opens es.ieslosmontecillos.appusoselector to javafx.fxml;
    exports es.ieslosmontecillos.appusoselector;
}