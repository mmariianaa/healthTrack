
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class JFREECHARTT extends JFrame{
    
    public JFREECHARTT(){
        //crear grafico de barras
        DefaultCategoryDataset dataset = new  DefaultCategoryDataset();
        dataset.addValue(1, "hidrogeno verde", "2021");
        dataset.addValue(2, "hidrogeno blanco", "2022");
        dataset.addValue(3, "hidrogeno azul", "2023");
        
        JFreeChart chart = ChartFactory.createBarChart(
        "healthtrack", 
        "anos",
        "tipo hidrogeno",
        dataset
        );
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        
        add(chartPanel);
              
    }

    public static void main(String[] args) {
        //es para crear la pantalla o cuadro blanco sin nada 
        JFREECHARTT v = new JFREECHARTT();//instancia
        v.setTitle("hola");//nombre del grafico
        v.setSize(800,600);//tamano 
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        
        
    }
}
