/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantallapricipal;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author usuario
 */
public class miGrafica {
    public ChartPanel crearGrafica() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Pulsaciones", "Lunes");
        dataset.addValue(2, "Pulsaciones", "Martes");
        dataset.addValue(3, "Pulsaciones", "Miércoles");

        JFreeChart chart = ChartFactory.createLineChart(
            "Frecuencia Cardíaca", "Día", "Valor",
            dataset
        );

        return new ChartPanel(chart);
    }
}

