/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardSeries.Areas;

import com.steema.teechart.TChart;
import com.steema.teechart.drawing.Color;
import com.steema.teechart.drawing.StringAlignment;
import com.steema.teechart.editors.ChartEditor;
import com.steema.teechart.legend.LegendAlignment;
import com.steema.teechart.styles.Area;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 *
 * @author norike
 */
public class VegetationGrowth extends javax.swing.JPanel {

    /**
     * Creates new form VegetationGrowth
     */
    public VegetationGrowth() {
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
        tChart1.getHeader().setAlignment(StringAlignment.NEAR);
        tChart1.getHeader().getFont().setColor(Color.BLACK);
        tChart1.getHeader().getFont().setSize(19);
        tChart1.getHeader().getFont().setName("Roboto Th");
        tChart1.getHeader().getFont().setBold(true);
        tChart1.getHeader().getFont().getShadow().setColor(Color.GRAY);
        tChart1.getHeader().getFont().getShadow().setHorizSize(1);
        tChart1.getHeader().getFont().getShadow().setSmoothBlur(2);
        tChart1.getHeader().getFont().getShadow().setVertSize(1);
        tChart1.getHeader().setText("Vegetation growth");
        tChart1.getAxes().getBottom().getAxisPen().setVisible(false);
        tChart1.getAxes().getBottom().getGrid().setVisible(false);
        tChart1.getAxes().getBottom().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getBottom().getLabels().getFont().setSize(24);
        tChart1.getAxes().getBottom().getLabels().getFont().setName("Segoe UI");
        tChart1.getAxes().getBottom().getMinorTicks().setVisible(false);
        tChart1.getAxes().getBottom().getTicks().setTransparency(100);
        tChart1.getAxes().getBottom().getTicksInner().setVisible(false);
        tChart1.getAxes().getBottom().getTitle().setCaption("Days");
        tChart1.getAxes().getBottom().getTitle().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getBottom().getTitle().getFont().setSize(19);
        tChart1.getAxes().getBottom().getTitle().getFont().setName("Segoe UI");
        tChart1.getAxes().getBottom().setIncrement(3);
        tChart1.getAxes().getLeft().getAxisPen().setVisible(false);
        tChart1.getAxes().getLeft().getGrid().setColor(new Color(221, 221, 221));
        tChart1.getAxes().getLeft().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getLeft().getLabels().getFont().setSize(19);
        tChart1.getAxes().getLeft().getLabels().getFont().setName("Segoe UI");
        tChart1.getAxes().getLeft().getMinorTicks().setVisible(false);
        tChart1.getAxes().getLeft().getTicks().setLength(7);
        tChart1.getAxes().getLeft().getTicks().setTransparency(100);
        tChart1.getAxes().getLeft().getTicksInner().setVisible(false);
        tChart1.getLegend().setAlignment(LegendAlignment.TOP);
        tChart1.getLegend().getFont().setSize(19);
        tChart1.getLegend().getFont().setName("Roboto Th");
        tChart1.getLegend().getPen().setVisible(false);
        tChart1.getLegend().getShadow().setVisible(false);
        tChart1.getLegend().getSymbol().getPen().setVisible(false);
        tChart1.getAspect().setView3D(false);
        tChart1.getPanel().setColor(Color.WHITE);
        
        Area area1 = new Area(tChart1.getChart());
        area1.getMarks().setVisible(false);
        area1.setColor(new Color(255, 153, 102));
        area1.setTitle("With nutrient");
        area1.getAreaLinesPen().setVisible(false);
        area1.getLinePen().setVisible(false);
        area1.getPointer().setVisible(false);
        area1.setTransparency(64);
        
        Area area2 = new Area(tChart1.getChart());
        area2.getMarks().setVisible(false);
        area2.setColor(new Color(128, 255, 255));
        area2.setTitle("No added nutrient");
        area2.getAreaLinesPen().setVisible(false);
        area2.getLinePen().setVisible(false);
        area2.getPointer().setVisible(false);
        area2.setTransparency(70);
        
        Random rnd = new Random();
        for (int t=0; t< 15; t++) {
            area1.add(rnd.nextInt(100));
            area2.add(rnd.nextInt(60));
        }

        area1.setSmoothed(true);
        area2.setSmoothed(true);
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
}
