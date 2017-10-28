package com.example.brainhackers.adboost;

/**
 * Created by shivang on 28/10/17.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class GraphHoarding extends AppCompatActivity {


    //private static String TAG = "GraphHoarding";
    private int yData[] = {10, 15, 5, 12, 2, 1, 5, 20, 17, 13};       //backend se ayega ye
    private String xData[] = {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10"};
    PieChart pieChart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        pieChart = (PieChart) findViewById(R.id.idPieChart);

        // pieChart.setDescription("Number of People reached");
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(25f);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("Hoarding Chart");
        pieChart.setCenterTextSize(10);
        //pieChart.setDrawEntryLabels(true);

        addDataSet();

//        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
//            @Override
//            public void onValueSelected(Entry e, Highlight h) {
//
//                int pos1 = e.toString().indexOf("(sum): ");
//                String sales = e.toString().substring(pos1 + 7);
//                for(int i = 0; i < yData.length; i++){
//                    if(yData[i] == Integer.parseInt(sales)){
//                        pos1 = i;
//                        break;
//                    }
//                }
//                String employee = xData[pos1 + 1];
//                Toast.makeText(GraphHoarding.this, "People " + employee+ "\n" + "Number " + sales, Toast.LENGTH_LONG).show();
//
//            }

//            @Override
//            public void onNothingSelected() {
//
//            }
//        });


    }

    private void addDataSet() {
        ArrayList<PieEntry> yEntrys;
        yEntrys = new ArrayList<>();
        ArrayList<String> xEntrys = new ArrayList<>();
        for (int i = 0; i < yData.length; i++){
            yEntrys.add(new PieEntry(yData[i], i));
        }
        for (int i = 0; i < xData.length; i++){
            xEntrys.add(xData[i]);
        }

        //create the data set
        PieDataSet pieDataSet = new PieDataSet(yEntrys, "Number of people reached");
        pieDataSet.setSliceSpace(2);
        pieDataSet.setValueTextSize(12);

        //add colors
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.GRAY);
        colors.add(Color.CYAN);
        colors.add(Color.BLUE);
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.MAGENTA);
        colors.add(Color.rgb(165, 42, 42));
        colors.add(Color.rgb(128,0,128));
        colors.add(Color.rgb(255, 165, 0));
        pieDataSet.setColors(colors);

        //add legend to chart
        Legend legend= pieChart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART);

        //create piechart object
        PieData pieData = new PieData((pieDataSet));
        pieChart.setData(pieData);
        pieChart.invalidate();

    }
}
