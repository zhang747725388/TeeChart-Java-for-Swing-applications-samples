/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardSeries.PieAndDonut;

import com.steema.teechart.TChart;
import com.steema.teechart.drawing.Color;
import com.steema.teechart.drawing.StringAlignment;
import com.steema.teechart.editors.ChartEditor;
import com.steema.teechart.legend.LegendTextStyle;
import com.steema.teechart.styles.Donut;
import com.steema.teechart.styles.MarksStyle;
import com.steema.teechart.styles.StringList;
import com.steema.teechart.themes.ColorPalettes;
import com.steema.teechart.themes.Theme;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author norike
 */
public class DonutChart extends javax.swing.JPanel {

    /**
     * Creates new form Donut
     */
    public DonutChart() {
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
        tChart1.getPanel().getGradient().setVisible(false);
        tChart1.getLegend().setTransparent(true);
        tChart1.getHeader().setAlignment(StringAlignment.NEAR);
        tChart1.getHeader().getFont().setColor(Color.GRAY);
        tChart1.getHeader().getFont().setSize(21);
        tChart1.getHeader().getFont().setName("Segoe UI");
        tChart1.getHeader().setText("Countries by Area");
        tChart1.getLegend().getFont().setSize(19);
        tChart1.getLegend().getFont().setName("Segoe UI");
        tChart1.getLegend().getShadow().setTransparency(0);
        tChart1.getLegend().setTextStyle(LegendTextStyle.PLAIN);
        tChart1.getAspect().setView3D(false);
        tChart1.getPanel().setColor(Color.WHITE);
        ColorPalettes.applyPalette(tChart1.getChart(), Theme.MetroPalette);
        Donut donut = new Donut(tChart1.getChart());
        donut.setCircled(true);
        donut.getMarks().setTransparent(true);
        donut.getMarks().setStyle(MarksStyle.LABELPERCENT);
        donut.getMarks().getArrow().setColor(Color.SILVER);
        donut.getMarks().getCallout().getArrow().setColor(Color.SILVER);
        donut.getMarks().getCallout().setDistance(3);
        donut.getMarks().getCallout().setLength(14);
        //donut.setBevelPercent(6);
        donut.getMarksPie().setLegSize(31);
        donut.getMarksPie().setVertCenter(true);
        donut.add(new double[]{27.3, 16, 15.4, 15.4, 13.6, 12.3});
        donut.setLabels(new StringList(new String[]{"Russia", "Canada", "China", "United States", "Brazil", "Australia"}));
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
