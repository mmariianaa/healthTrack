/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantallapricipal;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author usuario
 */
public class miGrafica {
    public ChartPanel crearGrafica() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Pulsaciones", "Monday");
        dataset.addValue(2, "Pulsaciones", "Tuesday");
        dataset.addValue(3, "Pulsaciones", "Wednesday");
        dataset.addValue(4, "Pulsaciones", "Thursday");
        dataset.addValue(5, "Pulsaciones", "Friday");
        dataset.addValue(6, "Pulsaciones", "Saturday");
        dataset.addValue(7, "Pulsaciones", "Sunday");
        

        JFreeChart chart = ChartFactory.createLineChart(
            "Calories", "Day","Values",
            dataset      
        );
        
        return new ChartPanel(chart);
    }
}
    
