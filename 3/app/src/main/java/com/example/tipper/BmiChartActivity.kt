package com.example.tipper

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class BmiChartActivity : AppCompatActivity() {
    private var mChart: LineChart? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart_bmi)

        // Inicjalizacja wykresu
        mChart = findViewById(R.id.chartBmi)
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);

        // Tworzenie danych do wykresu (fikcyjne dane)
        val entries: MutableList<Entry> = ArrayList()
        entries.add(Entry(0f, 22.5f))
        entries.add(Entry(1f, 23.0f))
        entries.add(Entry(2f, 24.5f))
        entries.add(Entry(3f, 24.0f))
        entries.add(Entry(4f, 25.5f))
        entries.add(Entry(5f, 26.0f))

        // Ustawianie danych na wykresie
        val dataSet = LineDataSet(entries, "BMI")
        dataSet.color = Color.BLUE
        dataSet.lineWidth = 2f
        dataSet.circleRadius = 4f
        val lineData = LineData(dataSet)
        mChart.setData(lineData)

        // Ustawianie opisu wykresu
        val description = Description()
        description.text = "Zmiany BMI w czasie"
        mChart.setDescription(description)

        // Odświeżanie wykresu
        mChart.invalidate()
    }
}