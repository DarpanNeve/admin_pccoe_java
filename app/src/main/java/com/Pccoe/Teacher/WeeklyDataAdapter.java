package com.Pccoe.Teacher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WeeklyDataAdapter extends RecyclerView.Adapter {
    MainModel[] data;
    public WeeklyDataAdapter(MainModel[] data) {
        this.data = data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_break_view, parent, false);
            return new ViewHolderTwo(view);
        }
        if (viewType == 2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_lunch_break_view, parent, false);
            return new ViewHolderThree(view);
        }
        if (viewType == 3) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_practical_view, parent, false);
            return new ViewHolderFour(view);
        }
        if (viewType == 4) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_two_hour_view, parent, false);
            return new ViewHolderFive(view);
        }
        if (viewType == 5) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_half_hour_view, parent, false);
            return new ViewHolderSix(view);
        }
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_theory_view, parent, false);
        return new ViewHolderOne(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (data[position].getType()) {
            case "B":
                ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
                break;
            case "L":
                ViewHolderThree viewHolderThree = (ViewHolderThree) holder;
                break;
            case "S":
                ViewHolderFive viewHolderFive = (ViewHolderFive) holder;
                viewHolderFive.Subject.setText(String.valueOf(data[position].getSubject()));
                viewHolderFive.Classroom.setText(String.valueOf(data[position].getClassroom()));
                viewHolderFive.Teacher.setText(String.valueOf(data[position].getTeacher()));
                break;
            case "H":
                ViewHolderSix viewHolderSix = (ViewHolderSix) holder;
                viewHolderSix.Subject.setText(String.valueOf(data[position].getSubject()));
                viewHolderSix.Classroom.setText(String.valueOf(data[position].getClassroom()));
                viewHolderSix.Teacher.setText(String.valueOf(data[position].getTeacher()));
                break;

            case "P":
                ViewHolderFour viewHolderFour = (ViewHolderFour) holder;
                viewHolderFour.Subject.setText(String.valueOf(data[position].getSubject()));
                viewHolderFour.Classroom.setText(String.valueOf(data[position].getClassroom()));
                viewHolderFour.Batch.setText(String.valueOf(data[position].getBatch()));
                viewHolderFour.Teacher.setText(String.valueOf(data[position].getTeacher()));
                break;
            default:
                ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
                viewHolderOne.Subject.setText(String.valueOf(data[position].getSubject()));
                viewHolderOne.Classroom.setText(String.valueOf(data[position].getClassroom()));
                viewHolderOne.Teacher.setText(String.valueOf(data[position].getTeacher()));
                break;
        }
    }
    @Override
    public int getItemViewType(int position) {
        switch (data[position].getType()) {
            case "B":
                return 1;
            case "L":
                return 2;
            case "P":
                return 3;
            case "S":
                return 4;
            case "H":
                return 5;
        }
        return 0;
    }
    @Override
    public int getItemCount() {
        return data.length;
    }
    static class ViewHolderOne extends RecyclerView.ViewHolder {
        TextView Classroom, Subject, Teacher;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            Classroom = itemView.findViewById(R.id.classroom);
            Subject = itemView.findViewById(R.id.subject);
            Teacher = itemView.findViewById(R.id.teacher);

        }
    }
    static class ViewHolderTwo extends RecyclerView.ViewHolder {
        TextView Classroom;


        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            Classroom = itemView.findViewById(R.id.classroom);

        }
    }
    static class ViewHolderThree extends RecyclerView.ViewHolder {


        public ViewHolderThree(@NonNull View itemView) {
            super(itemView);


        }
    }
    static class ViewHolderFour extends RecyclerView.ViewHolder {
        TextView Classroom, Subject, Teacher, Batch;

        public ViewHolderFour(@NonNull View itemView) {
            super(itemView);
            Classroom = itemView.findViewById(R.id.classroom);
            Subject = itemView.findViewById(R.id.subject);
            Teacher = itemView.findViewById(R.id.teacher);
            Batch = itemView.findViewById(R.id.batch);


        }
    }
    static class ViewHolderFive extends RecyclerView.ViewHolder {
        TextView Classroom, Subject, Teacher;
        public ViewHolderFive(@NonNull View itemView) {
            super(itemView);
            Classroom = itemView.findViewById(R.id.classroom);
            Subject = itemView.findViewById(R.id.subject);
            Teacher = itemView.findViewById(R.id.teacher);


        }
    }
    static class ViewHolderSix extends RecyclerView.ViewHolder {
        TextView Classroom, Subject, Teacher;
        public ViewHolderSix(@NonNull View itemView) {
            super(itemView);
            Classroom = itemView.findViewById(R.id.classroom);
            Subject = itemView.findViewById(R.id.subject);
            Teacher = itemView.findViewById(R.id.teacher);


        }
    }
}
