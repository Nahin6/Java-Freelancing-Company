
package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class LaodChartSceneController implements Initializable {

    @FXML
    private LineChart<String,Number> LineChartFXID;
    @FXML
    private PieChart PieCharFxID;
    @FXML
    private Label piceChartlabel;
  

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
             
        
    }    

    @FXML
    private void ViewLineChartButton(ActionEvent event) {
        
        LineChartFXID.getData().clear();
        XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
        series1.getData().add(new XYChart.Data<String,Number>("Jan",200));
        series1.getData().add(new XYChart.Data<String,Number>("Feb",230));
        series1.getData().add(new XYChart.Data<String,Number>("Mar",310));
        series1.getData().add(new XYChart.Data<String,Number>("Apr",430));
        series1.setName("New user Visited");
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        series2.getData().add(new XYChart.Data<String,Number>("Jan",100));
        series2.getData().add(new XYChart.Data<String,Number>("Feb",210));
        series2.getData().add(new XYChart.Data<String,Number>("Mar",270));
        series2.getData().add(new XYChart.Data<String,Number>("Apr",300));
        series2.setName("New Cusotmer Registered");
        
        XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
        series3.getData().add(new XYChart.Data<String,Number>("Jan",100));
        series3.getData().add(new XYChart.Data<String,Number>("Feb",150));
        series3.getData().add(new XYChart.Data<String,Number>("Mar",170));
        series3.getData().add(new XYChart.Data<String,Number>("Apr",207));
        series3.setName("New Freelancer Registered");
        
        LineChartFXID.getData().addAll(series1,series2,series3);
    }

    @FXML
    private void ViewPieChartButton(ActionEvent event) {
        
        ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Investment in thousand",50),
            new PieChart.Data("Profit in thousand",80)
        );
        
        PieCharFxID.setData(list);
        
        for(PieChart.Data data: PieCharFxID.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent event) {
        piceChartlabel.setText(String.valueOf(data.getPieValue()));  
                }
            }
            );
        }
    }
    
}
