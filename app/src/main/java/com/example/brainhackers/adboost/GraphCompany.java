<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <com.github.mikephil.charting.charts.BarChart
        android:id="@+id/barChart"
        android:layout_width="0dp"
        android:layout_marginEnd="20dp"
        app:layout_constraintRight_toRightOf="parent"
        android:layout_marginRight="20dp"
        android:layout_marginStart="20dp"
        app:layout_constraintLeft_toLeftOf="parent"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_height="0dp"
        app:layout_constraintBottom_toBottomOf="parent"
        android:layout_marginBottom="20dp" />
</android.support.constraint.ConstraintLayout>
