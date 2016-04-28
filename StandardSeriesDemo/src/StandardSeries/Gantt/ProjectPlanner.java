/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardSeries.Gantt;

import com.steema.teechart.DateTime;
import com.steema.teechart.TChart;
import com.steema.teechart.drawing.Color;
import com.steema.teechart.editors.ChartEditor;
import com.steema.teechart.styles.Gantt;
import com.steema.teechart.styles.Series;
import com.steema.teechart.themes.ColorPalettes;
import com.steema.teechart.themes.Theme;
import com.steema.teechart.tools.DragPoint;
import com.steema.teechart.tools.DragPointStyle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author norike
 */
public class ProjectPlanner extends javax.swing.JPanel {

    /**
     * Creates new form ProjectPlanner
     */
    public ProjectPlanner() {
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
        tChart1.getWalls().setVisible(false);
        tChart1.getHeader().getFont().setColor(Color.GRAY);
        tChart1.getHeader().getFont().setSize(21);
        tChart1.getHeader().getFont().setName("Segoe UI");
        tChart1.getHeader().setText("Project Planner");
        tChart1.getAxes().getBottom().getAxisPen().setColor(new Color(64, 64, 64));
        tChart1.getAxes().getBottom().getGrid().setColor(new Color(169, 169, 169));
        tChart1.getAxes().getBottom().setIncrement(30.0);
        tChart1.getAxes().getBottom().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getBottom().getLabels().getFont().setSize(16);
        tChart1.getAxes().getBottom().getLabels().getFont().setName("Verdana");
        tChart1.getAxes().getBottom().getTicksInner().setColor(new Color(169, 169, 169));
        tChart1.getAxes().getBottom().getTitle().setCaption("Time");
        tChart1.getAxes().getBottom().getTitle().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getBottom().getTitle().getFont().setSize(28);
        tChart1.getAxes().getBottom().getTitle().getFont().setName("Segoe UI");
        tChart1.getAxes().getLeft().getAxisPen().setVisible(false);
        tChart1.getAxes().getLeft().getGrid().setColor(new Color(169, 169, 169));
        tChart1.getAxes().getLeft().getLabels().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getLeft().getLabels().getFont().setSize(13);
        tChart1.getAxes().getLeft().getLabels().getFont().setName("Verdana");
        tChart1.getAxes().getLeft().getMinorTicks().setVisible(false);
        tChart1.getAxes().getLeft().getTicksInner().setColor(new Color(169, 169, 169));
        tChart1.getAxes().getLeft().getTitle().setCaption("Task");
        tChart1.getAxes().getLeft().getTitle().getFont().setColor(Color.GRAY);
        tChart1.getAxes().getLeft().getTitle().getFont().setSize(24);
        tChart1.getAxes().getLeft().getTitle().getFont().setName("Segoe UI");
        tChart1.getLegend().setVisible(false);
        tChart1.getAspect().setView3D(false);
        tChart1.getPanel().setColor(Color.WHITE);

        ColorPalettes.applyPalette(tChart1.getChart(), Theme.MacOSPalette);

        Gantt gantt = new Gantt(tChart1.getChart());
        gantt.getMarks().setTransparent(true);
        gantt.getMarks().setVisible(true);
        gantt.getPointer().getPen().setVisible(false);

        DragPoint drag = new DragPoint(gantt);
        drag.setStyle(DragPointStyle.X);

        gantt.getPointer().setVertSize(25);
        gantt.add(new DateTime(2012, 5, 21), new DateTime(2012, 5, 29), 0, "Production");
        gantt.add(new DateTime(2012, 9, 3), new DateTime(2012, 11, 10), 1, "Marketing");
        gantt.add(new DateTime(2012, 3, 13), new DateTime(2012, 3, 31), 2, "Approve");
        gantt.add(new DateTime(2012, 6, 7), new DateTime(2012, 7, 5), 3, "Prototype");
        gantt.add(new DateTime(2012, 10, 11), new DateTime(2012, 11, 5), 4, "Evaluation");
        gantt.add(new DateTime(2012, 4, 2), new DateTime(2012, 4, 29), 5, "Design");
        gantt.add(new DateTime(2012, 9, 1), new DateTime(2012, 11, 7), 2, "Testing");

        gantt.setMarkTextResolver(new Series.MarkTextResolver() {

            @Override
            public String getMarkText(int valueIndex, String markText) {
                switch (valueIndex) {
                    case 0:
                        markText = "20 %";
                        break;
                    case 1:
                        markText = "40 %";
                        break;
                    case 2:
                        markText = "10 %";
                        break;
                    case 3:
                        markText = "75 %";
                        break;
                    case 4:
                        markText = "55 %";
                        break;
                    case 5:
                        markText = "60 %";
                        break;
                    case 6:
                        markText = "25 %";
                        break;
                }
                return markText;
            }
        });
    }

    private void setEditor() {
        tChart1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    ChartEditor.editChart(tChart1.getChart());
                }
            }
        });
    }
}