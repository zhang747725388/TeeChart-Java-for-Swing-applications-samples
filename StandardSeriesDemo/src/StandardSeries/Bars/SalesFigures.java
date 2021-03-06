/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardSeries.Bars;

import com.steema.teechart.TChart;
import com.steema.teechart.TextShapeStyle;
import com.steema.teechart.axis.AxisLabelStyle;
import com.steema.teechart.drawing.Color;
import com.steema.teechart.editors.ChartEditor;
import com.steema.teechart.legend.LegendAlignment;
import com.steema.teechart.styles.ArrowHeadStyle;
import com.steema.teechart.styles.Bar;
import com.steema.teechart.styles.BarStyle;
import com.steema.teechart.styles.MarksStyle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author norike
 */
public class SalesFigures extends javax.swing.JPanel {

    /**
     * Creates new form SalesFigures
     */
    public SalesFigures() {
        initComponents();
        
        createChart();
        initChart();        
        setEditor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    protected TChart tChart1;
    
    private void createChart() {
        tChart1 = new TChart();
        add(tChart1);
    }

    private void initChart() {
        tChart1.getWalls().setVisible(false);
        tChart1.getPanel().getGradient().setVisible(false);
        tChart1.getPanel().setColor(Color.WHITE);
        
        tChart1.getHeader().getFont().setColor(Color.GRAY);
        tChart1.getHeader().getFont().setSize(25);
        tChart1.getHeader().getFont().setName("Segoe UI");
        tChart1.getHeader().getFont().getShadow().setColor(Color.GRAY);
        tChart1.getHeader().getFont().getShadow().setVisible(true);
        tChart1.getHeader().setText("Sales Figures");
        
        tChart1.getAxes().getBottom().getAxisPen().setVisible(false);
        tChart1.getAxes().getBottom().getGrid().setVisible(false);
        tChart1.getAxes().getBottom().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getBottom().getLabels().getFont().setSize(24);
        tChart1.getAxes().getBottom().getLabels().getFont().setName("Verdana");
        tChart1.getAxes().getBottom().getLabels().setStyle(AxisLabelStyle.TEXT);
        tChart1.getAxes().getBottom().getMinorTicks().setVisible(false);
        tChart1.getAxes().getBottom().getTicks().setTransparency(100);
        tChart1.getAxes().getBottom().getTicksInner().setVisible(false);
        
        tChart1.getAxes().getLeft().setMinMax(0, 15);
        tChart1.getAxes().getLeft().getAxisPen().setVisible(false);
        tChart1.getAxes().getLeft().getGrid().setColor(new Color(169, 169, 169));
        tChart1.getAxes().getLeft().setIncrement(3);
        tChart1.getAxes().getLeft().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getLeft().getLabels().getFont().setSize(24);
        tChart1.getAxes().getLeft().getLabels().getFont().setName("Verdana");
        tChart1.getAxes().getLeft().getMinorTicks().setVisible(false);
        tChart1.getAxes().getLeft().getTicks().setLength(7);
        tChart1.getAxes().getLeft().getTicks().setTransparency(100);
        tChart1.getAxes().getLeft().getTicksInner().setVisible(false);
        tChart1.getAxes().getLeft().getTitle().setText("$ 000s");
        tChart1.getAxes().getLeft().getTitle().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getLeft().getTitle().getFont().setSize(13);
        tChart1.getAxes().getLeft().getTitle().getFont().setName("Segoe UI");
        
        tChart1.getLegend().setAlignment(LegendAlignment.BOTTOM);
        tChart1.getLegend().getFont().setSize(19);
        tChart1.getLegend().getFont().setName("Verdana");
        tChart1.getLegend().getPen().setVisible(false);
        tChart1.getLegend().getShadow().setTransparency(0);
        tChart1.getLegend().getShadow().setVisible(false);
        tChart1.getLegend().getSymbol().getPen().setVisible(false);
        
        tChart1.getAspect().setView3D(false);
            
        tChart1.getZoom().setAllow(false);
        
        Bar bar1 = new Bar(tChart1.getChart());
        bar1.setColor(new Color(255, 128, 64));
        
        Bar bar2 = new Bar(tChart1.getChart());
        bar2.setColor(new Color(255, 174, 27));
        
        initSeries(bar1);
        initSeries(bar2);
        
        bar1.setOffsetPercent(-10);
        bar2.setOffsetPercent(10);
        
        bar1.setTitle("Apples");
        bar2.setTitle("Pears");
            
        bar1.add(5, "jan");
        bar1.add(2, "feb");
        bar1.add(1, "mar");
        bar1.add(4, "apr");
        bar1.add(10, "may");
        bar1.add(11, "jun");
        bar1.add(15, "jul");
        
        bar2.add(new double[] {7, 5, 1, 6, 2, 11, 5});
        
        bar1.getMarks().setStyle(MarksStyle.LABELVALUE);
    }

    private void setEditor() {
        tChart1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                 if (e.getClickCount()==2) {
                    ChartEditor.editChart(tChart1.getChart());
                }
            }
        });
    }

    private void initSeries(Bar bar) {
        bar.getPen().setVisible(false);
        bar.getMarks().getFont().setColor(Color.WHITE);
        bar.getMarks().getFont().setName("Segoe UI");
        bar.getMarks().getFrame().setVisible(false);
        bar.getMarks().getShadow().setVisible(false);
        bar.getMarks().getArrow().setVisible(false);
        bar.getMarks().setBackColor(new Color(225, 128, 64));
        bar.getMarks().getCallout().getArrow().setVisible(false);
        bar.getMarks().getCallout().setArrowHead(ArrowHeadStyle.LINE);
        bar.getMarks().getCallout().setDistance(8);
        bar.getMarks().getCallout().setLength(0);
        bar.getMarks().setColor(bar.getColor());
        bar.getMarks().setShapeStyle(TextShapeStyle.ROUNDRECTANGLE);
        bar.getMarks().setBorderRound(4);
        bar.setBarStyle(BarStyle.ROUNDRECTANGLE);
        bar.setRoundSize(10);
        bar.setBarWidthPercent(80);
    }
}
